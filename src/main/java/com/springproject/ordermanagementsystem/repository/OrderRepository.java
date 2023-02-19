package com.springproject.ordermanagementsystem.repository;

import com.springproject.ordermanagementsystem.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

   /* @Query("SELECT * FROM Order o WHERE o.createdTime = ?1")
    List<Order> findOrdersByCreatedTime(Date createdTime);
*/
 /*   @Query("SELECT o FROM Order o, OrderLine ol,Product p WHERE p.id = ol.product.id and ol.order.id = o.id and p.id =?1")
    List<Order> findOrdersByProductId (Long id);

    @Query("select o from Order o,Customer c where c.id = o.customer.id and c.id = ?1")
    List<Order> findOrdersByCustomerId(Long id);

*/

}
