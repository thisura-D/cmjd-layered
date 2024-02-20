/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dto.ItemDTO;
import edu.ijse.layered.entity.ItemEntity;
import edu.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public class ItemServiceImpl implements ItemService {

    @Override
    public String saveItem(ItemDTO dto) throws Exception {
        
        ItemEntity itemEntity = new ItemEntity(dto.getItemCode(), 
                dto.getItemDescription(),
                dto.getItemPackSize(), 
                dto.getItemUnitPrice(), 
                dto.getItemQty());
        
        return null;
    }

    @Override
    public String updateItem(ItemDTO itemDTO) throws Exception {
        return null;
    }

    @Override
    public String deleteItem(String CustID) throws Exception {
        return null;
    }

    @Override
    public ItemDTO searchItem(String CustID) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ItemDTO> loadAllItems() throws Exception {
        return null;
    }

}
