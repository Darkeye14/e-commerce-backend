package com.dbms.ecommerce.repo

import com.dbms.ecommerce.domain.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepo : JpaRepository<Product, Int> {
//    fun findByProductId(productId: Int): Product
//    fun findByProductName(productName: String): Product
//    fun findByDesc(desc: String): Product
//    fun findByPrice(price: Double): Product
}