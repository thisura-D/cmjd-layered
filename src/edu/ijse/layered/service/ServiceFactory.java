 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service;

import edu.ijse.layered.service.custom.impl.CustomereServiceImpl;
import edu.ijse.layered.service.custom.impl.ItemServiceImpl;
import edu.ijse.layered.service.custom.impl.OrderServiceImpl;

/**
 *
 * @author Thisura
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();

        }

        return serviceFactory;
    }

    public enum ServiceType {
        ITEM,
        CUSTOMER,
        ORDER;
    }

    public SuperService getService(ServiceType serviceType) {

        switch (serviceType) {
            case ITEM:
                return new ItemServiceImpl();
            case CUSTOMER:
                return new CustomereServiceImpl();
            case ORDER:
                return new OrderServiceImpl();
            default:
                return null;
        }
    }

}
