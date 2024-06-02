/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;

import edu.ijse.layered.db.DBconnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Thisura
 */
public class CrudUtil {
    
    private static PreparedStatement getPreparedStaement (String query, Object... args) throws SQLException{
        Connection connection = DBconnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        
        if(args != null){
            for(int i=0 ; i <args.length ; i++){
                preparedStatement.setObject(i+1, args[i]);
            }
        }
        return preparedStatement;       
    }
    
    public static boolean executeUpdate(String query, Object... args) throws SQLException{
        return getPreparedStaement(query, args).executeUpdate() > 0;
    }
    
    public static ResultSet executeQuery(String query, Object... args) throws SQLException{
        
        return getPreparedStaement(query, args).executeQuery();
    }
}
