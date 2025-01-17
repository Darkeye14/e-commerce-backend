package com.dbms.ecommerce.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "orders")
data class Orders(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val orderId: Long = 0,

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    val customer: Customer,

    @Column(nullable = false)
    val orderDate: LocalDateTime = LocalDateTime.now(),

    @OneToMany(mappedBy = "orders", cascade = [CascadeType.ALL])
    val orderItems: MutableList<OrderItem> = mutableListOf()
)
