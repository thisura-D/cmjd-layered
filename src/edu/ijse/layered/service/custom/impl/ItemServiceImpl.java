/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dto.ItemDTO;
import edu.ijse.layered.entity.ItemEntity;
import edu.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public class ItemServiceImpl implements ItemService {

    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);

    @Override
    public String saveItem(ItemDTO dto) throws Exception {

        ItemEntity itemEntity = new ItemEntity(dto.getItemCode(),
                dto.getItemDescription(),
                dto.getItemPackSize(),
                dto.getItemUnitPrice(),
                dto.getItemQty());

        if (itemDao.add(itemEntity)) {
            return "Successfully Saved";
        } else {
            return "Failed Save";
        }
    }

    @Override
    public String updateItem(ItemDTO dto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(dto.getItemCode(),
                dto.getItemDescription(),
                dto.getItemPackSize(),
                dto.getItemUnitPrice(),
                dto.getItemQty());

        if (itemDao.update(itemEntity)) {
            return "successfully Saved";
        } else {
            return "Failed Update";
        }
    }

    @Override
    public String deleteItem(String CustID) throws Exception {
        if (itemDao.delete(CustID)) {
            return "Successfully Deleted";
        } else {
            return "Failed to Delete";
        }

    }

    @Override
    public ItemDTO searchItem(String CustID) throws Exception {

        ItemEntity ie = itemDao.get(CustID);
        
        ItemDTO itemDTO = new ItemDTO(ie.getItemCode(), 
                ie.getPackSize(), 
                ie.getDescription(), 
                ie.getUnitPrice(), 
                ie.getQtyOnHand());
        
        return itemDTO;

    }

    @Override
    public ArrayList<ItemDTO> loadAllItems() throws Exception {

        ArrayList<ItemEntity> entitys = itemDao.loadAll();

        ArrayList<ItemDTO> dTOs = new ArrayList<>();

        for (ItemEntity ie : entitys) {
            dTOs.add(new ItemDTO(ie.getItemCode(),
                    ie.getPackSize(),
                    ie.getDescription(),
                    ie.getUnitPrice(),
                    ie.getQtyOnHand()));
        }

        return dTOs;
    }
}
