/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controllers.CustomerCardListController;
import Controllers.EmployeeListController;
import Controllers.GoodsController;
import Controllers.HistoryController;
import Controllers.OrderController;
import Controllers.RepositoryController;
import Controllers.SettingsController;
import Controllers.ShiftController;
import Ultility.JsonDataFile;
import Models.*;
import Ultility.CustomPair;
import Ultility.IDGenerator;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FPTSHOP
 */
public class CommodityManagement {

    private static final String HOME = System.getProperty("user.dir");
    private static final String SEPARATOR = File.separator;
    private static final String DATA_FOLDER = HOME + SEPARATOR + "data" + SEPARATOR;
    private static final String REPOSITORY_PATH = DATA_FOLDER + "repositoryData.json";
    private static final String SHIFT_PATH = DATA_FOLDER + "currentShift.json";
    private static final String HISTORY_PATH = DATA_FOLDER + "historyData.json";
    private static final String EMPLOYEE_LIST_PATH = DATA_FOLDER + "employeeListData.json";
    private static final String CUSTOMER_CARD_LIST_PATH = DATA_FOLDER + "customerCardListData.json";
    private static final String IDGENERATOR_PATH = DATA_FOLDER + "idgenerator.json";
    private static final String SETTINGS_PATH = DATA_FOLDER + "settingsData.json";
    private static final String UNITS_PATH = DATA_FOLDER + "units.json";

    final static Scanner sc = new Scanner(System.in);
    final static JsonDataFile myData = new JsonDataFile();
    final static ShiftController shiftCtr = new ShiftController();
    final static RepositoryController repoCtr = new RepositoryController();
    final static OrderController orderCtr = new OrderController();
    final static HistoryController hisCtr = new HistoryController();
    final static EmployeeListController employeeListCtr = new EmployeeListController();
    final static CustomerCardListController cardListCtr = new CustomerCardListController();
    final static SettingsController settingsCtr = new SettingsController();

    static Repository repo = new Repository();
    static Shift shift = new Shift();
    static History history = new History();
    static CustomerCardList cardList = new CustomerCardList();
    static EmployeeList employeeList = new EmployeeList();
    static IDGenerator idGenerator = new IDGenerator();
    static Settings settings = new Settings();
    static Units units = new Units();

    private static void menuOfMainFunction() {
        System.out.println("");
        System.out.println("******COMMODITY_MANAGEMENT******");
        System.out.println("* 1. Repository Management     *");
        System.out.println("* 2. Make New Order            *");
        System.out.println("* 3. Current Shift             *");
        System.out.println("* 4. Commodity History         *");
        System.out.println("* 5. Employee Management       *");
        System.out.println("* 6. Customer card Management  *");
        System.out.println("* 7. Settings                  *");
        System.out.println("* 8. Exit                      *");
        System.out.println("********************************");
        System.out.print("Option => ");
    }

    public static void main(String[] args) {
        String choice;
        //loadData();
        insertDataDirectly();
        do {
            menuOfMainFunction();
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    if (shift == null) {
                        shiftCtr.getView().shiftNotOpenCaution();
                        break;
                    }
                    repoCtr.repositoryManagement(shift, idGenerator, repo);
                    break;
                case "2":
                    break;
                case "3":
                    shift = shiftCtr.ShiftManagement(employeeList, settings.getStore(),
                            idGenerator, history, shift);
                    break;
                case "4":
                    hisCtr.historyManagement(history);
                    break;
                case "5":
                    employeeListCtr.employeeListManagement(employeeList, shift);
                    break;
                case "6":
                    cardListCtr.customerCardListManagement(cardList, idGenerator);
                    break;
                case "7":
                    break;
                case "8":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong input, Please type from 1->6!");
                    break;
            }
        } while (!choice.equals("8"));
        saveData();
    }

    private static void loadData() {
        repo = myData.load(Path.of(REPOSITORY_PATH), Repository.class, repo);
        shift = myData.load(Path.of(SHIFT_PATH), Shift.class, shift);
        history = myData.load(Path.of(HISTORY_PATH), History.class, history);
        employeeList = myData.load(Path.of(EMPLOYEE_LIST_PATH), EmployeeList.class, employeeList);
        cardList = myData.load(Path.of(CUSTOMER_CARD_LIST_PATH), CustomerCardList.class, cardList);
        idGenerator = myData.load(Path.of(IDGENERATOR_PATH), IDGenerator.class, idGenerator);
        settings = myData.load(Path.of(SETTINGS_PATH), Settings.class, settings);
        units = myData.load(Path.of(SETTINGS_PATH), Units.class, units);
    }

    private static void saveData() {
        myData.save(Path.of(REPOSITORY_PATH), repo);
        myData.save(Path.of(SHIFT_PATH), shift);
        myData.save(Path.of(HISTORY_PATH), history);
        myData.save(Path.of(EMPLOYEE_LIST_PATH), employeeList);
        myData.save(Path.of(CUSTOMER_CARD_LIST_PATH), cardList);
        myData.save(Path.of(IDGENERATOR_PATH), idGenerator);
        myData.save(Path.of(SETTINGS_PATH), settings);
        myData.save(Path.of(UNITS_PATH), units);
    }

    private static void insertDataDirectly() {
        units.getBucket().add("Hộp");
        units.getBucket().add("Cái");
        units.getBucket().add("Que");
        units.getBucket().add("Lon");
        units.getBucket().add("Quyển");
        units.getBucket().add("Gói");
        units.getBucket().add("Chai");
        units.getBucket().add("Túi");
        repo.getList().add(new Goods("Custard Cake", "TuyenIndustry", new BigDecimal("30000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(0)));
        repo.getList().add(new Goods("Cup Cake", "TuyenIndustry", new BigDecimal("8000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(1)));
        repo.getList().add(new Goods("Donut", "TuyenIndustry", new BigDecimal("12000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(1)));
        repo.getList().add(new Goods("Flan", "Kem cacao", new BigDecimal("5000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(0)));
        repo.getList().add(new Goods("Strawberry ice-cream", "Kem cacao", new BigDecimal("9000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(2)));
        repo.getList().add(new Goods("Paddle pop", "Kem cacao", new BigDecimal("5000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(2)));
        repo.getList().add(new Goods("Lemon Soda", "Kem cacao", new BigDecimal("8000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(3)));
        repo.getList().add(new Goods("Ruler", "HuyStationery", new BigDecimal("3000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(1)));
        repo.getList().add(new Goods("Pencil", "HuyStationery", new BigDecimal("2000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(1)));
        repo.getList().add(new Goods("Rubber", "HuyStationery", new BigDecimal("2000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(1)));
        repo.getList().add(new Goods("Note", "HuyStationery", new BigDecimal("7000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(4)));
        repo.getList().add(new Goods("Sugar", "CookWithTung", new BigDecimal("22000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(5)));
        repo.getList().add(new Goods("Cooking oil", "CookWithTung", new BigDecimal("48000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(6)));
        repo.getList().add(new Goods("Spring-roll", "CookWithTung", new BigDecimal("50000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(5)));
        repo.getList().add(new Goods("Salt", "CookWithTung", new BigDecimal("5000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(7)));
        repo.getList().add(new Goods("Instant Noodle", "CookWithTung", new BigDecimal("14000"), idGenerator.generateID(Goods.class.getName(), 6), units.getBucket().get(7)));
        repo.getList().get(0).getShipments().add(new Shipment(new BigDecimal("20"), new BigDecimal("20000"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 11, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(0).getShipments().add(new Shipment(new BigDecimal("40"), new BigDecimal("19000"), LocalDate.of(2023, 3, 15), LocalDate.of(2023,11, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(0).getShipments().add(new Shipment(new BigDecimal("30000"), new BigDecimal("18000"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 11, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 11, 14)));
        repo.getList().get(1).getShipments().add(new Shipment(new BigDecimal("50"), new BigDecimal("3000"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 11, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(1).getShipments().add(new Shipment(new BigDecimal("20"), new BigDecimal("4000"), LocalDate.of(2023, 3, 15), LocalDate.of(2023,11, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(1).getShipments().add(new Shipment(new BigDecimal("10"), new BigDecimal("5000"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 11, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(2).getShipments().add(new Shipment(new BigDecimal("35"), new BigDecimal("5000"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 11, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(2).getShipments().add(new Shipment(new BigDecimal("22"), new BigDecimal("6000"), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 11, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(2).getShipments().add(new Shipment(new BigDecimal("29"), new BigDecimal("7000"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 11, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(3).getShipments().add(new Shipment(new BigDecimal("50"), new BigDecimal("2500"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 11, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(3).getShipments().add(new Shipment(new BigDecimal("51"), new BigDecimal("2400"), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 11, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(3).getShipments().add(new Shipment(new BigDecimal("33"), new BigDecimal("2100"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 11, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(4).getShipments().add(new Shipment(new BigDecimal("56"), new BigDecimal("4500"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 11, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(4).getShipments().add(new Shipment(new BigDecimal("44"), new BigDecimal("4700"), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 11, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(4).getShipments().add(new Shipment(new BigDecimal("33"), new BigDecimal("3800"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 11, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(5).getShipments().add(new Shipment(new BigDecimal("22"), new BigDecimal("2500"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 11, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(5).getShipments().add(new Shipment(new BigDecimal("46"), new BigDecimal("2700"), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 11, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(5).getShipments().add(new Shipment(new BigDecimal("68"), new BigDecimal("2200"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 11, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(6).getShipments().add(new Shipment(new BigDecimal("42"), new BigDecimal("4000"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 11, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(6).getShipments().add(new Shipment(new BigDecimal("65"), new BigDecimal("4300"), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 11, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(6).getShipments().add(new Shipment(new BigDecimal("26"), new BigDecimal("5000"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 11, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(7).getShipments().add(new Shipment(new BigDecimal("33"), new BigDecimal("1000"), LocalDate.of(2023, 3, 13), LocalDate.of(2025, 10, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(7).getShipments().add(new Shipment(new BigDecimal("77"), new BigDecimal("1200"), LocalDate.of(2023, 3, 15), LocalDate.of(2025, 10, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(7).getShipments().add(new Shipment(new BigDecimal("88"), new BigDecimal("1000"), LocalDate.of(2023, 3, 17), LocalDate.of(2025, 10, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(8).getShipments().add(new Shipment(new BigDecimal("13"), new BigDecimal("800"), LocalDate.of(2023, 3, 13), LocalDate.of(2025, 10, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(8).getShipments().add(new Shipment(new BigDecimal("16"), new BigDecimal("750"), LocalDate.of(2023, 3, 15), LocalDate.of(2025, 10, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(8).getShipments().add(new Shipment(new BigDecimal("44"), new BigDecimal("700"), LocalDate.of(2023, 3, 17), LocalDate.of(2025, 10, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(9).getShipments().add(new Shipment(new BigDecimal("15"), new BigDecimal("700"), LocalDate.of(2023, 3, 13), LocalDate.of(2025, 10, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(9).getShipments().add(new Shipment(new BigDecimal("17"), new BigDecimal("750"), LocalDate.of(2023, 3, 15), LocalDate.of(2025, 10, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(9).getShipments().add(new Shipment(new BigDecimal("44"), new BigDecimal("750"), LocalDate.of(2023, 3, 17), LocalDate.of(2025, 10, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(10).getShipments().add(new Shipment(new BigDecimal("42"), new BigDecimal("3000"), LocalDate.of(2023, 3, 13), LocalDate.of(2025, 10, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(10).getShipments().add(new Shipment(new BigDecimal("19"), new BigDecimal("3000"), LocalDate.of(2023, 3, 15), LocalDate.of(2025, 10, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(10).getShipments().add(new Shipment(new BigDecimal("18"), new BigDecimal("4000"), LocalDate.of(2023, 3, 17), LocalDate.of(2025, 10, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(11).getShipments().add(new Shipment(new BigDecimal("15"), new BigDecimal("11000"), LocalDate.of(2023, 3, 13), LocalDate.of(2024, 3, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(11).getShipments().add(new Shipment(new BigDecimal("22"), new BigDecimal("11000"), LocalDate.of(2023, 3, 15), LocalDate.of(2024, 3, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(11).getShipments().add(new Shipment(new BigDecimal("23"), new BigDecimal("12000"), LocalDate.of(2023, 3, 17), LocalDate.of(2024, 3, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(12).getShipments().add(new Shipment(new BigDecimal("32"), new BigDecimal("24000"), LocalDate.of(2023, 3, 13), LocalDate.of(2024, 3, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(12).getShipments().add(new Shipment(new BigDecimal("31"), new BigDecimal("24000"), LocalDate.of(2023, 3, 15), LocalDate.of(2024, 3, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(12).getShipments().add(new Shipment(new BigDecimal("33"), new BigDecimal("25000"), LocalDate.of(2023, 3, 17), LocalDate.of(2024, 3, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(13).getShipments().add(new Shipment(new BigDecimal("35"), new BigDecimal("25000"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 11, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(13).getShipments().add(new Shipment(new BigDecimal("37"), new BigDecimal("25000"), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 11, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(13).getShipments().add(new Shipment(new BigDecimal("28"), new BigDecimal("25000"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 11, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(14).getShipments().add(new Shipment(new BigDecimal("43"), new BigDecimal("2000"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 12, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(14).getShipments().add(new Shipment(new BigDecimal("22"), new BigDecimal("2000"), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 12, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(14).getShipments().add(new Shipment(new BigDecimal("25"), new BigDecimal("2000"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 12, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        repo.getList().get(15).getShipments().add(new Shipment(new BigDecimal("23"), new BigDecimal("6500"), LocalDate.of(2023, 3, 13), LocalDate.of(2023, 10, 14), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 20)));
        repo.getList().get(15).getShipments().add(new Shipment(new BigDecimal("27"), new BigDecimal("6500"), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 10, 16), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 3, 25)));
        repo.getList().get(15).getShipments().add(new Shipment(new BigDecimal("11"), new BigDecimal("6500"), LocalDate.of(2023, 3, 17), LocalDate.of(2023, 10, 18), idGenerator.generateID(Shipment.class.getName(), 8),LocalDate.of(2023, 4, 14)));
        employeeList.getList().add(new Employee(new BigDecimal("22000"), "2223666611", "Nguyen Gia", "Huy", "0705737293", "so10-Ngo2-YenPhuc-PhucLa-HaDong", 19, Gender.MALE));
        employeeList.getList().add(new Employee(new BigDecimal("23000"), "3553646623", "Vu Hung", "Tung", "0905737293", "AeonMall HaDong", 16, Gender.MALE));
        employeeList.getList().add(new Employee(new BigDecimal("22000"), "7337593977", "Dao Van", "Tuyen", "0805737293", "220-TrieuKhuc-TanTrieu-ThanhTri", 20, Gender.MALE));
        employeeList.getList().add(new Employee(new BigDecimal("25000"), "3957577777", "Nguyen Thao", "Chi", "0505737293", "141-ChienThang-TanTrieu", 20, Gender.FEMALE));
        employeeList.getList().add(new Employee(new BigDecimal("20000"), "2727495500", "Tran Luu", "Dung", "0903737293", "Vinhome Riverside", 19, Gender.OTHER));
        cardList.getList().add(new CustomerCard(idGenerator.generateID(CustomerCard.class.getName(), 6), new Customer("Nguyen Duc", "Anh", "0975268264", "34 Nguyen Du", 20, Gender.MALE)));
        cardList.getList().get(0).setPoint(new BigInteger("100"));
        cardList.getList().get(0).setRank(CustomerRank.SILVER);
        cardList.getList().add(new CustomerCard(idGenerator.generateID(CustomerCard.class.getName(), 6), new Customer("Le Van", "Quyet", "0906333164", "26 Do Duc Duc", 20, Gender.OTHER)));
        cardList.getList().add(new CustomerCard(idGenerator.generateID(CustomerCard.class.getName(), 6), new Customer("Do Quynh", "Anh", "0971345298", "16 Cau Giay", 22, Gender.FEMALE)));
        cardList.getList().add(new CustomerCard(idGenerator.generateID(CustomerCard.class.getName(), 6), new Customer("Le Duc", "Cuong", "0916254167", "41 Minh Khai", 17, Gender.MALE)));
        settings.setStore(new Store("Chang hi", "bonEmMuonAnHotpotWangWang@gmail.com", "112-Nguyen Van Loc", 10, "0705737292"));
        settings.getStore().setPointsForOneVND(new BigInteger("10"));
        settings.getStore().setAmountForOnePoint(new BigDecimal("10000"));
        settings.getPriceAmountList().add("< 100000");
        settings.getPriceAmountList().add("100000 - 300000");
        settings.getPriceAmountList().add("300000 - 500000");
        settings.getPriceAmountList().add("< 500000");
        settings.getStore().setBronzeDiscountOffer(new CustomPair<>(new BigDecimal("0"), 0d));
        settings.getStore().setSilverDiscountOffer(new CustomPair<>(new BigDecimal("8000000"), 2d));
        settings.getStore().setGoldDiscountOffer(new CustomPair<>(new BigDecimal("12000000"), 3d));
        settings.getStore().setDiamondDiscountOffer(new CustomPair<>(new BigDecimal("30000000"), 4d));
//        GoodsList<Goods> orderGoodsList1 = new GoodsList();
//        orderGoodsList1.getList().add(repo.getList().get(0));
//        orderGoodsList1.getList().add(repo.getList().get(2));
//        orderGoodsList1.getList().add(repo.getList().get(3));
//        orderGoodsList1.getList().add(repo.getList().get(4));
//        shift.getOrderHisPerShift().add(new Order(LocalDateTime.parse("03/01/2023 05:05:05", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), "HD000001", PaymentOptions.CASH_PAYMENT, cardList.getList().get(1), employeeList.getList().get(0), orderGoodsList1.getList()));
//        GoodsList<Goods> orderGoodsList3 = new GoodsList();
//        orderGoodsList1.getList().add(repo.getList().get(4));
//        orderGoodsList1.getList().add(repo.getList().get(1));
//        orderGoodsList1.getList().add(repo.getList().get(7));
//        orderGoodsList1.getList().add(repo.getList().get(5));
//        shift.getOrderHisPerShift().add(new Order(LocalDateTime.parse("03/01/2023 06:25:05", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), "HD000002", PaymentOptions.OTHER_PAYMENT, cardList.getList().get(2), employeeList.getList().get(0), orderGoodsList3.getList()));
//        GoodsList<Goods> orderGoodsList2 = new GoodsList();
//        orderGoodsList1.getList().add(repo.getList().get(0));
//        orderGoodsList1.getList().add(repo.getList().get(2));
//        shift.getOrderHisPerShift().add(new Order(LocalDateTime.parse("03/01/2023 07:33:05", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), "HD000003", PaymentOptions.CASH_PAYMENT, cardList.getList().get(3), employeeList.getList().get(0), orderGoodsList2.getList()));
//        shift.getImportGoodsHis().getList().add(new ImportedGoods(repo.getList().get(0)));
//        shift.getImportGoodsHis().getList().add(new ImportedGoods(repo.getList().get(1)));
//        shift.getImportGoodsHis().getList().add(new ImportedGoods(repo.getList().get(2)));
//        shift.getImportGoodsHis().getList().add(new ImportedGoods(repo.getList().get(3)));
//        shift.getImportGoodsHis().getList().add(new ImportedGoods(repo.getList().get(4)));
//        shift.getImportGoodsHis().getList().add(new ImportedGoods(repo.getList().get(8)));
//        shift.getImportGoodsHis().getList().add(new ImportedGoods(repo.getList().get(12)));
//        
        System.out.println(new GoodsController().compare(repo.getList().get(0), repo.getList().get(1)));
    }

    public void clearScreen() {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17); // Holds CTRL key.
            pressbot.keyPress(76); // Holds L key.
            pressbot.keyRelease(17); // Releases CTRL key.
            pressbot.keyRelease(76); // Releases L key.
        } catch (AWTException ex) {
            Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void typeAnyKeyToContinue() {
        System.out.println("\nType any key to continue...");
        sc.nextLine();
    }

}
