/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dto;

/**
 *
 * @author Thisura
 */
public class ItemDTO {
    private String ItemCode;
    private String ItemPackSize;
    private String ItemDescription;
    private double ItemUnitPrice;
    private int ItemQty;

    public ItemDTO() {
    }

    public ItemDTO(String ItemCode, String ItemPackSize, String ItemDescription, double ItemUnitPrice, int ItemQty) {
        this.ItemCode = ItemCode;
        this.ItemPackSize = ItemPackSize;
        this.ItemDescription = ItemDescription;
        this.ItemUnitPrice = ItemUnitPrice;
        this.ItemQty = ItemQty;
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
     * @return the ItemPackSize
     */
    public String getItemPackSize() {
        return ItemPackSize;
    }

    /**
     * @param ItemPackSize the ItemPackSize to set
     */
    public void setItemPackSize(String ItemPackSize) {
        this.ItemPackSize = ItemPackSize;
    }

    /**
     * @return the ItemDescription
     */
    public String getItemDescription() {
        return ItemDescription;
    }

    /**
     * @param ItemDescription the ItemDescription to set
     */
    public void setItemDescription(String ItemDescription) {
        this.ItemDescription = ItemDescription;
    }

    /**
     * @return the ItemUnitPrice
     */
    public double getItemUnitPrice() {
        return ItemUnitPrice;
    }

    /**
     * @param ItemUnitPrice the ItemUnitPrice to set
     */
    public void setItemUnitPrice(double ItemUnitPrice) {
        this.ItemUnitPrice = ItemUnitPrice;
    }

    /**
     * @return the ItemQty
     */
    public int getItemQty() {
        return ItemQty;
    }

    /**
     * @param ItemQty the ItemQty to set
     */
    public void setItemQty(int ItemQty) {
        this.ItemQty = ItemQty;
    }

    @Override
    public String toString() {
        return "ItemDTO{" + "ItemCode=" + ItemCode + ", ItemPackSize=" + ItemPackSize + ", ItemDescription=" + ItemDescription + ", ItemUnitPrice=" + ItemUnitPrice + ", ItemQty=" + ItemQty + '}';
    }
    
    
    
}


