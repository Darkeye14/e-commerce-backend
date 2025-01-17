package com.dbms.ecommerce.repo

import com.dbms.ecommerce.domain.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepo : JpaRepository<Customer,Int> {
//    fun findByEmail(email: String): Customer
//    fun findByCustomerId(customerId: Int): Customer
//    fun findByEmailAndPassword(email: String, password: String): Customer

}