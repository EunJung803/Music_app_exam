package com.ll.exam.music_app.app.order.repository;

import com.ll.exam.music_app.app.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
