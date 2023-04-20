/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s1rja
 */
public class UsefulFunctions {

    Scanner sc = new Scanner(System.in);
    final String OUTPUT_DATE_PATTERN = "dd/MM/yyyy";
    final String INPUT_DATE_PATTERN = "d/M/y";
    final LocalDate CURRENT_DATE = LocalDate.now();
    int nameMaxSize;
    int providerMaxSize;
    int listPriceMaxSize;
    int totalQuantityMaxSize;
    int importPriceMaxSize;
    int quantityMaxSize;

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

    public Goods containGoods(String id, List<Goods> goodsList) {
        for (Goods tmpGoods : goodsList) {
            if (tmpGoods.getGoodsID().equals(id)) {
                return tmpGoods;
            }
        }
        return null;
    }

    public boolean checkIfNotEnouQuan(int inputQuantity, int deafaultQuantity) {
        if (inputQuantity > deafaultQuantity) {
            System.out.println("Doesn't have enough quantity!");
            return true;
        }
        return false;
    }

    public <E> boolean checkIfListEmpty(List<E> goodsList) {
        if (goodsList.isEmpty()) {
            System.out.println("Cannot process in an empty List!");
            return true;
        }
        return false;
    }

    public boolean checkIfNumPositive(int num) {
        if (num < 0) {
            System.out.println("This number cannot take a negative value!");
            return false;
        }
        return true;
    }

    public boolean checkIfNumIsZero(int num){
        if(num == 0){
            System.out.println("This number cannot be zero!");
            return true;
        }
        return false;
    }
    
    public int checkIfDuplicateGoods(List<Goods> goodsList, Goods checkingGoods) {
        // return index of the first dupicate goods in list, otherwise -1 will be returned
        for (Goods goods : goodsList) {
            if (goods.checkIfTwoGoodsIsDuplicate(checkingGoods)) {
                System.out.println("Same goods detected!");
                System.out.println("Aborting...");
                return goodsList.indexOf(goods);
            }
        }
        return -1;
    }

    public boolean checkIfNoInput(String str) {
        if ("".equalsIgnoreCase(str)) {
            System.out.println("Input is required!");
            return true;
        }
        return false;
    }

    public int typeInQuan(Shipment shipment) {
        while (true) {
            System.out.print("Type in quantity or type EXIT/BACK to exit/back: ");
            String inputStr = sc.nextLine();
            if (exitCase(inputStr)) {
                return 0;
            } else if (backCase(inputStr)) {
                return -1;
            } else if (checkIfNoInput(inputStr)) {
            } else {
                try {
                    int quantity = Integer.parseInt(inputStr);
                    if (!checkIfNumPositive(quantity)) {
                        continue;
                    }
                    shipment.setQuantity(quantity);
                    return 1;
                } catch (NumberFormatException nfe) {
                    wrInput();
                }
            }
        }
    }

    public int typeInManufac(Goods goods, List<Goods> goodsList) {
        while (true) {
            System.out.print("Type in manufacturer or type EXIT/BACK to go exit/back: ");
            String inputStr = sc.nextLine();
            if (exitCase(inputStr)) {
                return 0;
            } else if (backCase(inputStr)) {
                return -1;
            } else if (checkIfNoInput(inputStr)) {
            } else if (checkIfDuplicateGoods(goodsList, goods) != -1) {
            } else {
                goods.setProvider(inputStr);
                return 1;
            }
        }
    }

    public int typeInName(Goods goods) {
        while (true) {
            System.out.print("Type in name or type EXIT/BACK to exit/back: ");
            String inputStr = sc.nextLine();
            if (exitCase(inputStr)) {
                return 0;
            } else if (backCase(inputStr)) {
                return -1;
            } else if (checkIfNoInput(inputStr)) {
            } else {
                goods.setGoodsName(inputStr);
                return 1;
            }
        }
    }

    public int typeInListPrice(Goods goods) {
        while (true) {
            System.out.print("Type in listed price or type EXIT/BACK to go exit/back: ");
            String inputStr = sc.nextLine();
            if (exitCase(inputStr)) {
                return 0;
            } else if (backCase(inputStr)) {
                return -1;
            } else if (checkIfNoInput(inputStr)) {
            } else {
                try {
                    int listPrice = Integer.parseInt(inputStr);
                    if (!checkIfNumPositive(listPrice)) {
                        continue;
                    }
                    goods.setListPrice(listPrice);
                    return 1;
                } catch (NumberFormatException nfe) {
                    wrInput();
                }
            }
        }
    }

    public int typeInImportPrice(Shipment shipment) {
        while (true) {
            System.out.print("Input goods import price or type EXIT/BACK to go exit/back: ");
            String inputStr = sc.nextLine();
            if (exitCase(inputStr)) {
                return 0;
            } else if (backCase(inputStr)) {
                return -1;
            } else if (checkIfNoInput(inputStr)) {
            } else {
                try {
                    int importPrice = Integer.parseInt(inputStr);
                    if (checkIfNumPositive(importPrice)) {
                        shipment.setImportPrice(importPrice);
                        return 1;
                    }
                } catch (NumberFormatException nfe) {
                    wrInput();
                }
            }
        }
    }

    public int typeInProDate(Shipment shipment) {
        while (true) {
            System.out.print("Input production date or type EXIT/BACK to go exit/back: ");
            String inputStr = sc.nextLine();
            if (exitCase(inputStr)) {
                return 0;
            } else if (backCase(inputStr)) {
                return -1;
            } else {
                try {
                    LocalDate nsx = LocalDate.parse(inputStr, DateTimeFormatter
                            .ofPattern(INPUT_DATE_PATTERN));
                    if (nsx.isAfter(CURRENT_DATE)) {
                        System.out.println("Invalid Date, production date cannot be after current date!");
                    } else {
                        if (shipment.getHsd() != null) {
                            if (nsx.isAfter(shipment.getHsd())) {
                                System.out.println("Invalid Date, production date cannot be after expiration date!");
                                continue;
                            }
                        }
                        shipment.setNsx(nsx);
                        return 1;
                    }
                } catch (DateTimeException dte) {
                    wrInput();
                }
            }
        }
    }

    public int typeInEpirDate(Shipment shipment) {
        while (true) {
            System.out.print("Input expiration Date or type EXIT/BACK to go exit/back: ");
            String inputStr = sc.nextLine();
            if (exitCase(inputStr)) {
                return 0;
            } else if (backCase(inputStr)) {
                return -1;
            } else {
                try {
                    LocalDate hsd = LocalDate.parse(inputStr, DateTimeFormatter
                            .ofPattern(INPUT_DATE_PATTERN));
                    if (hsd.isBefore(shipment.getNsx())) {
                        System.out.println("Invalid Date, expiration date cannot be before production date!");
                    } else {
                        shipment.setHsd(hsd);
                        return 1;
                    }
                } catch (DateTimeException dte) {
                    wrInput();
                }
            }
        }
    }

    public boolean backCase(String str) {
        return "back".equalsIgnoreCase(str);
    }

    public void wrInput() {
        System.out.println("Invalid input! Please try again.");
    }

    public boolean exitCase(String str) {
        return "exit".equalsIgnoreCase(str);
    }

    public void computeSizeEachColumn(List<Goods> goodsList) {
        // duyet tu dau den cuoi mang de lay MAX_SIZE cua giatri input tung attributes
        nameMaxSize = "Name".length();
        providerMaxSize = "Provider".length();
        listPriceMaxSize = "List Price".length();
        totalQuantityMaxSize = "Total Quantity".length();
        importPriceMaxSize = "Import Price".length();
        quantityMaxSize = "Quantity".length();
        for (Goods goods : goodsList) {
            if (goods.getGoodsName().length() > nameMaxSize) {
                nameMaxSize = goods.getGoodsName().length();
            }
            if (goods.getProvider().length() > providerMaxSize) {
                providerMaxSize = goods.getProvider().length();
            }
            if (Long.toString(goods.getListPrice()).length() > listPriceMaxSize) {
                listPriceMaxSize = Long.toString(goods.getListPrice()).length();
            }
            if (Integer.toString(goods.getTotalQuantity()).length() > totalQuantityMaxSize) {
                totalQuantityMaxSize = Integer.toString(goods.getTotalQuantity()).length();
            }
            for (Shipment shipment : goods.getShipments()) {
                if (Long.toString(shipment.getImportPrice()).length() > importPriceMaxSize) {
                    importPriceMaxSize = Long.toString(shipment.getImportPrice()).length();
                }
                if (Integer.toString(shipment.getQuantity()).length() > quantityMaxSize) {
                    quantityMaxSize = Integer.toString(shipment.getQuantity()).length();
                }
            }
        }
    }

    public String formatDate(LocalDate date, String formatPattern) {
        return date.format(DateTimeFormatter.ofPattern(formatPattern));
    }

    public void showGoodsList(List<Goods> goodsList) {
        if (checkIfListEmpty(goodsList)) {
            return;
        }
        System.out.println();
        computeSizeEachColumn(goodsList);
        int totalColumnsSize = nameMaxSize
                + providerMaxSize
                + listPriceMaxSize
                + totalQuantityMaxSize
                + importPriceMaxSize
                + quantityMaxSize;
        final int extralengthOfBorder = 78;
        int borderLength = extralengthOfBorder + totalColumnsSize;
        System.out.println("|" + "-".repeat(borderLength) + "|");
        System.out.printf("| %-8s | %-" + String.format(nameMaxSize + "s")
                + " | %-" + String.format(providerMaxSize + "s")
                + " | %-" + String.format(listPriceMaxSize + "s")
                + " | %-" + String.format(totalQuantityMaxSize + "s")
                + " | %11s | %-15s | %-15s | %-" + String.format(importPriceMaxSize + "s")
                + " | %-" + String.format(quantityMaxSize + "s")
                + " |\n",
                "Goods ID", "Name",
                "Provider",
                "List Price",
                "Total Quantity",
                "Shipment ID", "Production Date", "Expiration Date", "Import Price",
                "Quantity");
        System.out.println("|" + "-".repeat(totalColumnsSize + 78) + "|");
        for (Goods goods : goodsList) {
            System.out.printf("| %-8s | %-" + String.format(nameMaxSize + "s")
                    + " | %-" + String.format(providerMaxSize + "s")
                    + " | %-" + String.format(listPriceMaxSize + "s")
                    + " | %-" + String.format(totalQuantityMaxSize + "s") + " |",
                    goods.getGoodsID(),
                    goods.getGoodsName(),
                    goods.getProvider(),
                    goods.getListPrice(),
                    goods.getTotalQuantity());
            if (!goods.getShipments().isEmpty()) {
                // If shipments already existed, fill them in the conlumns
                Shipment shipment = goods.getShipments().get(0);
                String productionDateString = formatDate(shipment.getNsx(), OUTPUT_DATE_PATTERN);
                String expirationDateString = formatDate(shipment.getHsd(), OUTPUT_DATE_PATTERN);
                System.out.printf(" %-11s | %-15s | %-15s | %-"
                        + String.format(importPriceMaxSize + "s")
                        + " | %-" + String.format(quantityMaxSize + "s")
                        + " |\n",
                        shipment.getShipmentID(), productionDateString, expirationDateString,
                        shipment.getImportPrice(),
                        shipment.getQuantity());
                // If existed more than 1 shipment, use for-loop to print all the others
                for (int i = 1; i < goods.getShipments().size(); i++) {
                    shipment = goods.getShipments().get(i);
                    productionDateString = formatDate(shipment.getNsx(), OUTPUT_DATE_PATTERN);
                    expirationDateString = formatDate(shipment.getHsd(), OUTPUT_DATE_PATTERN);
                    int spaceInGoodsColumns = nameMaxSize + providerMaxSize + listPriceMaxSize + totalQuantityMaxSize + 20;
                    System.out.printf("| %-" + String.format(spaceInGoodsColumns + "s")
                            + " | %-11s | %-15s | %-15s"
                            + " | %-" + String.format(importPriceMaxSize + "s")
                            + " | %-" + String.format(quantityMaxSize + "s") + " |\n",
                            "",
                            shipment.getShipmentID(), productionDateString, expirationDateString,
                            shipment.getImportPrice(),
                            shipment.getQuantity());
                }
            } else {
                // If haven't imported any goods yet, not fill in anything in the column
                System.out.printf(" %-11s | %-15s | %-15s | %-" + String.format(importPriceMaxSize + "s")
                        + " | %-" + String.format(quantityMaxSize + "s") + " |\n",
                        "", "", "", "", "");
            }
            System.out.println("|" + "-".repeat(borderLength) + "|");
        }
    }

    public Goods searchGoods(List<Goods> goodsList) {
        // return null if list is empty or choose 'back', otherwise A goods will be returned
        if (checkIfListEmpty(goodsList)) {
            return null;
        }
        String inputStr = new String();
        boolean completed = false;
        Goods searchingGoods = null;
        do {
            try {
                System.out.print("Input productID to search(Type name for suggestion) or BACK to go back: ");
                inputStr = sc.nextLine();
                if (backCase(inputStr)) {
                    break;
                }
                int searchingKey = Integer.parseInt(inputStr);
                searchingGoods = containGoods(inputStr, goodsList);
                if (searchingGoods == null) {
                    System.out.println("Your input ID doesnt exist.");
                    continue;
                }
                completed = true;
            } catch (NumberFormatException nfe) {
                // name suggestions for users
                List<Goods> bucket = new ArrayList<>();
                for (Goods tmpGoods : goodsList) {
                    String nameToLowerCase = tmpGoods.getGoodsName().toLowerCase();
                    String inputToLowerCase = inputStr.toLowerCase();
                    if (nameToLowerCase.contains(inputToLowerCase)) {
                        bucket.add(tmpGoods);
                    }
                }
                if (bucket.isEmpty()) {
                    System.out.println("No product match with your input!");
                } else {
                    System.out.print("\nSearching : \"" + inputStr + "\"");
                    showGoodsList(bucket);
                }
            }
        } while (!completed);
        return searchingGoods;
    }

    public Shipment searchShipments(Goods goods) {
        List<Goods> bucket = new ArrayList<>();
        if (checkIfListEmpty(goods.getShipments())) {
            return null;
        }
        bucket.add(goods);
        do {
            showGoodsList(bucket);
            System.out.print("Input shipment ID or type BACK to go back: ");
            String inputStr = sc.nextLine();
            if (backCase(inputStr)) {
                System.out.println("Back...");
                return null;
            } else {
                for (Shipment shipment : goods.getShipments()) {
                    if (inputStr.equals(shipment.getShipmentID())) {
                        return shipment;
                    }
                }
                System.out.println("No shipment found!");
            }
        } while (true);
    }
}
