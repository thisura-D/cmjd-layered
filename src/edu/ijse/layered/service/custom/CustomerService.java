/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.CustomerDTO;
import edu.ijse.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public interface CustomerService extends SuperService{
    
     String SaveCustomer (CustomerDTO customerDTO) throws Exception ;
     String UpdateCustomer (CustomerDTO customerDTO)throws Exception;
    String deleteItem (String CustID) throws Exception;
    CustomerDTO searchItem (String CustID) throws Exception;
    ArrayList<CustomerDTO> loadAllItems () throws Exception;    
    
}
