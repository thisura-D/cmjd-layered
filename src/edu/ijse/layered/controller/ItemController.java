/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;

import edu.ijse.layered.dto.ItemDTO;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.SuperService;
import edu.ijse.layered.service.custom.ItemService;
import javax.print.ServiceUIFactory;

/**
 *
 * @author Thisura
 */
public class ItemController {
    
    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
            

    public String saveItem(ItemDTO itemDTO) throws Exception {
        return itemService.saveItem(itemDTO);
    }

}
