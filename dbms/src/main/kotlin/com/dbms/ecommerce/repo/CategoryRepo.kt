package com.dbms.ecommerce.repo

import com.dbms.ecommerce.domain.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepo : JpaRepository<Category, Int> {
}