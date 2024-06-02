/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.service.custom;

import edu.ijse.layered.dto.ItemDTO;
import edu.ijse.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public interface ItemService extends SuperService{
    
    String saveItem (ItemDTO itemDTO) throws Exception;
    String updateItem (ItemDTO itemDTO) throws Exception;
    String deleteItem (String CustID) throws Exception;
    ItemDTO searchItem (String CustID) throws Exception;
    ArrayList<ItemDTO> loadAllItems () throws Exception;
    
    
}
