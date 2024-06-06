/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.OrderDao;
import edu.ijse.layered.entity.OrderEntity;
import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public class OrderDaoImpl implements OrderDao {

    @Override
    public boolean add(OrderEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Orders VALUES (?,?,?)" , t.getID(),t.getDate(),t.getCustID());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return false ;   }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public OrderEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderEntity> loadAll() throws Exception {
        return null;
    }

}
