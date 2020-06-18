package com.yjl.travel.service;

import com.yjl.travel.model.Order;
import com.yjl.travel.model.Route;

import java.util.List;


public interface OrderService {
     boolean submitOrder(int oid, int uid, int rid, String order_num, String comments, int tid);

     List<Order> haveBuy(int rid);

     List<Route> findHaveBuyByUid(int uid);

     boolean insertComments(String comments, int uid, int rid);

     List<Order> allComments(int rid);

     List<Order> findCommentByUidAndRid(int uid, int rid);

     int countComments(int rid);

     List<Order> findCommentsByUid(int uid);

     List<Order> findAll();

     List<Order> findCountOfEveryRoute();

     Order findOrder_num(int uid, int rid);

     Order findOid(String serialId);
}
