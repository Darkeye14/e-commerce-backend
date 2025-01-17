package com.dbms.ecommerce.domain

import jakarta.persistence.*

@Entity
@Table(name = "supplier")
data class Supplier(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val supplierId : Int,

    @Column(nullable = false)
    val supplierName : String,

    val address : String,

    val phone : String
)