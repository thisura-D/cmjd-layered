/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dto;

/**
 *
 * @author Thisura
 */
public class OrderDetailDTO {
    
    private String ItemID;
    private int quantity;
    private double discount;

    
    public OrderDetailDTO(String ItemID, int quantity, double discount) {
        this.ItemID = ItemID;
        this.quantity = quantity;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDTO{" + "ItemID=" + ItemID + ", quantity=" + quantity + ", discount=" + discount + '}';
    }

    public OrderDetailDTO() {
    }

    /**
     * @return the ItemID
     */
    public String getItemID() {
        return ItemID;
    }

    /**
     * @param ItemID the ItemID to set
     */
    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    
    
}
