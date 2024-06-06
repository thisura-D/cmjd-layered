/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.OrderDTO;
import edu.ijse.layered.service.SuperService;

/**
 *
 * @author Thisura
 */
public interface OrderService extends SuperService {
    
    String placeOrder(OrderDTO dto) throws Exception;
    
}
