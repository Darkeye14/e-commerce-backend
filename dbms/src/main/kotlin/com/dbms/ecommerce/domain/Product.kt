package com.dbms.ecommerce.domain

data class Product(
    val productId : Int,
    val productName : String,
    val desc : String,
    val price : Double
)
