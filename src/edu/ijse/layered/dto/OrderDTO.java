/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dto;

import java.util.List;

/**
 *
 * @author Thisura
 */
public class OrderDTO {
    
    private String OrderID;
    private String CustID;
    private String Date;
    
    private List<OrderDetailDTO> orderDetailDTOs;

    public OrderDTO() {
    }

    public OrderDTO(String OrderID, String CustID, String Date, List<OrderDetailDTO> orderDetailDTOs) {
        this.OrderID = OrderID;
        this.CustID = CustID;
        this.Date = Date;
        this.orderDetailDTOs = orderDetailDTOs;
    }

    @Override
    public String toString() {
        return "OrderDTO{" + "OrderID=" + getOrderID() + ", CustID=" + getCustID() + ", Date=" + getDate() + ", orderDetailDTOs=" + getOrderDetailDTOs() + '}';
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
     * @return the orderDetailDTOs
     */
    public List<OrderDetailDTO> getOrderDetailDTOs() {
        return orderDetailDTOs;
    }

    /**
     * @param orderDetailDTOs the orderDetailDTOs to set
     */
    public void setOrderDetailDTOs(List<OrderDetailDTO> orderDetailDTOs) {
        this.orderDetailDTOs = orderDetailDTOs;
    }
    
    
    
}
