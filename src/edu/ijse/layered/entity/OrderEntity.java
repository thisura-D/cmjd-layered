/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author Thisura
 */
public class OrderEntity {

    private String OrderID;
    private String Date;
    private String CustID;

    @Override
    public String toString() {
        return "OrderEntity{" + "ID=" + OrderID + ", Date=" + Date + ", CustID=" + CustID + '}';
    }

    public OrderEntity(String ID, String Date, String CustID) {
        this.OrderID = ID;
        this.Date = Date;
        this.CustID = CustID;
    }

    public OrderEntity() {
    }

    /**
     * @return the ID
     */
    public String getID() {
        return OrderID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String OrderID) {
        this.OrderID = OrderID;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

}
