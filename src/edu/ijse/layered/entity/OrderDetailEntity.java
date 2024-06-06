/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author Thisura
 */
public class OrderDetailEntity {

    private String OrderID;
    private String ItemCode;

    private int Quantity;
    private double Discount;

    public OrderDetailEntity(String OrderID, String ItemCode, int Quantity, double Discount) {
        this.OrderID = OrderID;
        this.ItemCode = ItemCode;
        this.Quantity = Quantity;
        this.Discount = Discount;
    }

    public OrderDetailEntity() {
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" + "OrderID=" + OrderID + ", ItemCode=" + ItemCode + ", Quantity=" + Quantity + ", Discount=" + Discount + '}';
    }

    /**
     * @return the OrderID
     */
    public String getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * @return the Discount
     */
    public double getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discount to set
     */
    public void setDiscount(double Discount) {
        this.Discount = Discount;
    }

    
    
}
