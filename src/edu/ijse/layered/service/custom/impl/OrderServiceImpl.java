/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.dao.custom.OrderDao;
import edu.ijse.layered.dao.custom.OrderDetailDao;
import edu.ijse.layered.db.DBconnection;
import edu.ijse.layered.dto.OrderDTO;
import edu.ijse.layered.dto.OrderDetailDTO;
import edu.ijse.layered.entity.ItemEntity;
import edu.ijse.layered.entity.OrderDetailEntity;
import edu.ijse.layered.entity.OrderEntity;
import edu.ijse.layered.service.custom.OrderService;
import java.sql.Connection;

/**
 *
 * @author Thisura
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao OrderDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ORDER);
    private OrderDetailDao OrderDetailDao = (OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ORDER_DETAIL);
    private ItemDao ItemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);

    @Override
    public String placeOrder(OrderDTO dto) throws Exception {

        Connection connection = DBconnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);

            OrderEntity orderEntity = new OrderEntity(dto.getOrderID(),
                    dto.getDate(),
                    dto.getCustID());
            if (OrderDao.add(orderEntity)) {

                boolean isItSaved = true;

                for (OrderDetailDTO odd : dto.getOrderDetailDTOs()) {
                    if (!OrderDetailDao.add(new OrderDetailEntity(dto.getOrderID(),
                            odd.getItemID(),
                            odd.getQuantity(),
                            odd.getDiscount()))) {
                        isItSaved = false;
                    }
                }

                if (isItSaved) {
                    boolean isItemUpdated = true;

                    for (OrderDetailDTO odd : dto.getOrderDetailDTOs()) {
                        ItemEntity ie = ItemDao.get(odd.getItemID());
                        if (ie != null) {
                            ie.setQtyOnHand(ie.getQtyOnHand() - odd.getQuantity());

                            if (!ItemDao.update(ie)) {
                                isItemUpdated = false;
                            }

                            if (isItemUpdated) {
                                connection.commit();
                                return "Success";
                            } else {
                                connection.rollback();
                                return "Item Quantity Save Error";
                            }
                        }

                    }

                } else {
                    connection.rollback();

                    return "Order Detail Save Error";
                }

            } else {
                connection.rollback();
                return "Order Save Error";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            throw e;

        } finally {
            connection.setAutoCommit(true);
        }

        return "Order Save Error";
    }

}
