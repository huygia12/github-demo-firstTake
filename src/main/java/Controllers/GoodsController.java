/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Goods;
import Models.GoodsList;
import Models.Shipment;
import Ultility.Cautions;
import View.GoodsView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FPTSHOP
 */
public class GoodsController {

    private final GoodsView view = new GoodsView();
    final Cautions ctions = new Cautions();
    private final Scanner sc = new Scanner(System.in);

    public GoodsController() {
    }

    public GoodsView getView() {
        return view;
    }

    public BigDecimal getVATMoneyPerGoods(Goods goods, int vat) {
        return goods.getListPrice().multiply(new BigDecimal(vat * 1.0 / 100));
    }

    public BigDecimal getTotalQuanByShipments(Goods goods) {
        BigDecimal totalQuan = BigDecimal.ZERO;
        for (Shipment shipment : goods.getShipments()) {
            totalQuan = totalQuan.add(shipment.getQuantity());
        }
        return totalQuan;
    }

    public Goods cloneGoods(Goods goods) {
        // tra ve 1 goods duoc cpy cac thuoc tinh cua goods goi ham cloneGoods() nay
        Goods cloneGoods = new Goods();
        cloneGoods.setID(goods.getID());
        cloneGoods.setGoodsName(goods.getGoodsName());
        cloneGoods.setListPrice(goods.getListPrice());
        cloneGoods.setManufacture(goods.getManufacture());
        for (Shipment shipment : goods.getShipments()) {
            cloneGoods.getShipments().add(new ShipmentController().cloneShipment(shipment));
        }
        return cloneGoods;
    }

    public <T extends Goods> boolean twoGoodsIsDup(T goods, T anotherGoods) {
        // tra ve true neu goods voi anotherGoods co cung name va manufacture, nguoc lai, tra ve true
        return goods.getGoodsName().equalsIgnoreCase(anotherGoods.getGoodsName())
                && goods.getManufacture().equalsIgnoreCase(anotherGoods.getManufacture());
    }

    public int indexOfDupShip(Goods goods, Shipment chekingShipment) {
        // tra ve -1 neu khong tim thay shipment trong shipmentList co cung hsd, nsx, importPrice voi checkingShipment
        // != -1 neu tim thay va chinh la index cua shipment do trong shipmentList
        for (Shipment tmpShipment : goods.getShipments()) {
            if (tmpShipment.getImportPrice() == chekingShipment.getImportPrice()
                    && tmpShipment.getHsd().isEqual(chekingShipment.getHsd())
                    && tmpShipment.getNsx().isEqual(chekingShipment.getNsx())) {
                return goods.getShipments().indexOf(tmpShipment);
            }
        }
        return -1;
    }

    public Shipment containShipment(Goods goods, String shipmentID) {
        // tra ve mot shipment voi tham so dau vao la id cua shipment do
        for (Shipment tmpShipment : goods.getShipments()) {
            if (tmpShipment.getID().equals(shipmentID)) {
                return tmpShipment;
            }
        }
        return null;
    }

    public Shipment searchShipment(Goods goods) {
        // tim kiem shipment trong goods goi den method seachShipment() nay
        GoodsList<Goods> bucket = new GoodsList(new ArrayList<>());
        if (ctions.checkIfListEmpty(goods.getShipments())) {
            return null;
        }
        bucket.getGoodsList().add(goods);
        do {
            new GoodsListController().getView().showGoodsList(bucket);
            System.out.print("Input shipment ID or type BACK to go back: ");
            String inputStr = sc.nextLine();
            if ("back".equalsIgnoreCase(inputStr)) {
                System.out.println("Back...");
                return null;
            } else if (ctions.checkIfNoInput(inputStr)) {
            } else {
                for (Shipment shipment : goods.getShipments()) {
                    if (inputStr.equals(shipment.getID())) {
                        return shipment;
                    }
                }
                System.out.println("No shipment found!");
            }
        } while (true);
    }

}
