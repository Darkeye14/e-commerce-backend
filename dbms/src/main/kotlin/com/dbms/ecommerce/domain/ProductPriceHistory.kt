package com.dbms.ecommerce.domain

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime


@Entity
@Table(name = "productPriceHistory")
data class ProductPriceHistory(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val historyId: Long = 0,

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    val product: Product,

    @Column(precision = 19, scale = 2)
    val oldPrice: BigDecimal? = null,

    @Column(nullable = false, precision = 19, scale = 2)
    val newPrice: BigDecimal,

    @Column(nullable = false)
    val changeDate: LocalDateTime = LocalDateTime.now()
)