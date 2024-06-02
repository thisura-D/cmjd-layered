/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import java.sql.ResultSet;
import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.CustomerDao;
import edu.ijse.layered.entity.CustomerEntity;
import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)",
                t.getCustID(),
                t.getCustTitle(),
                t.getCustName(),
                t.getDOB(),
                t.getSalary(),
                t.getCustAddress(),
                t.getCity(),
                t.getProvince(),
                t.getPostalCode());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET CustTitle = ? , CustName = ? , DOB = ? , salary = ? , CustAddress = ? , City = ? , Province = ? , PostalCode = ? WHERE CustID = ? ",
                t.getCustTitle(),
                t.getCustName(),
                t.getDOB(),
                t.getSalary(),
                t.getCustAddress(),
                t.getCity(),
                t.getProvince(),
                t.getPostalCode(),
                t.getCustID());
    }

    @Override
    public boolean delete(String id) throws Exception {

        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE CustID = ? ", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {

        ResultSet resultset = CrudUtil.executeQuery("SELECT * FROM Customer WHERE CustID = ? ", id);

        while (resultset.next()) {
            CustomerEntity ce = new CustomerEntity(resultset.getString(1),
                    resultset.getString(2),
                    resultset.getString(3),
                    resultset.getString(4),
                    Double.parseDouble(resultset.getString(5)),
                    resultset.getString(6),
                    resultset.getString(7),
                    resultset.getString(8),
                    resultset.getString(9));
            
            return ce;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> loadAll() throws Exception {

        ResultSet resultset = CrudUtil.executeQuery("SELECT CustID,CustTitle,CustName,salary,CustAddress,City from Customer", null);

        ArrayList<CustomerEntity> entitys = new ArrayList<>();

        while (resultset.next()) {
            CustomerEntity ce = new CustomerEntity(resultset.getString(1),
                    resultset.getString(2),
                    resultset.getString(3),
                    "",
                    Double.parseDouble(resultset.getString(4)),
                    resultset.getString(5),
                    resultset.getString(6),
                    "",
                    "");

            entitys.add(ce);
        }

        return entitys;
    }

}
