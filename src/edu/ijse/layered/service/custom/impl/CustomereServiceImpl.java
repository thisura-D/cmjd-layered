/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.CustomerDao;
import edu.ijse.layered.dto.CustomerDTO;
import edu.ijse.layered.entity.CustomerEntity;
import edu.ijse.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public class CustomereServiceImpl implements CustomerService {

    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public String SaveCustomer(CustomerDTO dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(dto.getCustID(),
                dto.getCustTitle(),
                dto.getCustName(),
                dto.getCustDOB(),
                dto.getCustSalary(),
                dto.getCustAddress(),
                dto.getCustCity(),
                dto.getCustProvience(),
                dto.getCustZIP());

        if (customerDao.add(customerEntity)) {
            return "Customer Saved Successfully";
        } else {
            return "Customer was not saved";
        }
    }

    @Override
    public String UpdateCustomer(CustomerDTO dto) throws Exception {
                CustomerEntity customerEntity = new CustomerEntity(dto.getCustID(),
                dto.getCustTitle(),
                dto.getCustName(),
                dto.getCustDOB(),
                dto.getCustSalary(),
                dto.getCustAddress(),
                dto.getCustCity(),
                dto.getCustProvience(),
                dto.getCustZIP());

        if (customerDao.update(customerEntity)) {
            return "Customer Updated Successfully";
        } else {
            return "Customer was not Updated";
        }
    }

    @Override
    public String deleteItem(String CustID) throws Exception {
        if(customerDao.delete(CustID)){
            return "Custonmer Successfully Deleted";
        }else{
            return "Customer was not Deleted";
        }
        
    }

    @Override
    public CustomerDTO searchItem(String CustID) throws Exception {
        
        CustomerEntity e = customerDao.get(CustID);
        
        return new CustomerDTO (e.getCustID(), 
                    e.getCustTitle(), 
                    e.getCustName(), 
                    e.getDOB(), 
                    e.getSalary(), 
                    e.getCustAddress(), 
                    e.getCity(), 
                    e.getProvince(), 
                    e.getPostalCode());   
    }
    

    @Override
    public ArrayList<CustomerDTO> loadAllItems() throws Exception {
        ArrayList<CustomerEntity> entitys = customerDao.loadAll();
        
        ArrayList<CustomerDTO> dTOs = new ArrayList<>();
        
        for (CustomerEntity e : entitys){
            dTOs.add(new CustomerDTO(e.getCustID(), 
                    e.getCustID(), 
                    e.getCustName(), 
                    e.getDOB(), 
                    e.getSalary(), 
                    e.getCustAddress(), 
                    e.getCity(), 
                    e.getProvince(), 
                    e.getPostalCode()));
        }
        
        return dTOs;
        
    }

}
