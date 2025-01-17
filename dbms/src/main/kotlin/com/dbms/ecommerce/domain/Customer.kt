package com.dbms.ecommerce.domain

import jakarta.persistence.*

@Entity
@Table(name = "customer")
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val customerId : Int,

    @Column(nullable = false)
    val customerName : String,

    @Column(name = "address")
    val address : String,

    @Column(name = "phone")
    val phone : String,

    @Column(nullable = false, unique = true)
    val email: String
)