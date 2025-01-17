package com.dbms.ecommerce.domain

import jakarta.persistence.*

@Entity
@Table(name = "product")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val productId : Int,

    @Column(nullable = false)
    val productName : String,

    val description : String,

    @Column(nullable = false,)
    val price : Double,

    @ManyToMany
    @JoinTable(
        name = "productCategory",
        joinColumns = [JoinColumn(name = "productId")],
        inverseJoinColumns = [JoinColumn(name = "categoryId")]
    )
    val categories: MutableSet<Category> = mutableSetOf()
)
