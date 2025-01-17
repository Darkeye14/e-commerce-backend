package com.dbms.ecommerce.domain

import jakarta.persistence.*

@Entity
@Table(name = "category")
data class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val categoryId : Int,

    @Column(nullable = false, unique = true)
    val categoryName: String,

    @ManyToMany(mappedBy = "categories")
    val products: MutableSet<Product> = mutableSetOf()
)