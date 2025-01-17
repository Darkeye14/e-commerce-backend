package com.dbms.ecommerce.repo

import com.dbms.ecommerce.domain.OrderItem
import org.springframework.data.jpa.repository.JpaRepository

interface OrderItemRepo :JpaRepository<OrderItem, Long> {
}