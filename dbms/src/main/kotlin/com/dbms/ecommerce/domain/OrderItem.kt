package com.dbms.ecommerce.domain

import jakarta.persistence.*


@Entity
@Table(name = "orderItem")
data class OrderItem(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val orderItemId: Long = 0,

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    val orders: Orders,

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    val product: Product,

    @Column(nullable = false)
    val quantity: Int,

    @Column(nullable = false)
    val price: Double
)