/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;

import edu.ijse.layered.dao.custom.impl.ItemDaoImpl;

/**
 *
 * @author Thisura
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {

    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }

        return daoFactory;
    }

    public enum DaoType {

        ITEM;

    }

    public SuperDao getDao(DaoType daoType) {
        switch (daoType) {
            case ITEM:
                return new ItemDaoImpl();
            default:
                return null;
        }
    }

}
