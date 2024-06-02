/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.dao;

import java.util.ArrayList;

/**
 *
 * @author Thisura
 */
public interface CrudDao<ObType, ID> extends SuperDao {

    boolean add (ObType t) throws Exception;

    boolean update(ObType t) throws Exception;
    
    boolean delete (ID id) throws Exception;
    
    ObType get (ID id) throws Exception;
    
    ArrayList<ObType> loadAll () throws Exception;

}
