/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.entity.ItemEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Thisura
 */
public class ItemDaoImpl implements ItemDao {

    @Override
    public boolean add(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Item VALUES (?,?,?,?,?)",
                t.getItemCode(),
                t.getDescription(),
                t.getPackSize(),
                t.getUnitPrice(),
                t.getQtyOnHand());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Item SET Description=?, PackSize=?, UnitPrice=?, QtyOnHand =? WHERE ItemCode = ?  ",
                t.getDescription(),
                t.getPackSize(),
                t.getUnitPrice(),
                t.getQtyOnHand(),
                t.getItemCode());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Item WHERE ItemCode = ?", id);
    }

    @Override
    public ItemEntity get(String id) throws Exception {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM Item WHERE ItemCode=?", id);

        while (rs.next()) {
            ItemEntity ie = new ItemEntity(rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(4),
                    rs.getInt(5));
            return ie;
        }
        return null;
    }
    
    
    

    @Override
    public ArrayList<ItemEntity> loadAll() throws Exception {
        ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM Item", null);

        ArrayList<ItemEntity> arrayList = new ArrayList<>();

        while (resultSet.next()) {
            ItemEntity ie = new ItemEntity(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getDouble(4),
                    resultSet.getInt(5));
            arrayList.add(ie);
        }

        return arrayList;
    }

}
