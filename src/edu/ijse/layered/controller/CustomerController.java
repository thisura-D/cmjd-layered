/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.CustomerDTO;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public class CustomerController {

    CustomerService customereService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDTO dTO) throws Exception {
        return customereService.SaveCustomer(dTO);
    }

    public String updateCustomer(CustomerDTO dTO) throws Exception {
        return customereService.UpdateCustomer(dTO);
    }

    public ArrayList<CustomerDTO> loadTable() throws Exception {
        return customereService.loadAllItems();
    }

    public CustomerDTO searchCustomer(String CustID) throws Exception {
        return customereService.searchItem(CustID);
    }

    public String delete(String CustID) throws Exception {
        return customereService.deleteItem(CustID);
    }

}
