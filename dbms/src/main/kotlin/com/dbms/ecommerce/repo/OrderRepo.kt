package com.dbms.ecommerce.repo

import com.dbms.ecommerce.domain.Orders
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepo :JpaRepository<Orders, Long> {
}