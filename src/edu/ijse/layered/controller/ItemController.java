/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.ItemDTO;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public class ItemController {
    
    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
            

    public String saveItem(ItemDTO itemDTO) throws Exception {
        return itemService.saveItem(itemDTO);
    }

    public String updateItem(ItemDTO itemDTO) throws Exception {
        return itemService.updateItem(itemDTO);
    }

    public String deleteItem(String ItemID) throws Exception {

        return itemService.deleteItem(ItemID);

    }
    
    public ArrayList<ItemDTO> loadTable() throws Exception{
        
        return itemService.loadAllItems();
        
    }
    
    public ItemDTO searchItem(String ItemID) throws Exception{
        
        return itemService.searchItem(ItemID);
        
    }

}
