package com.dbms.ecommerce.repo

import com.dbms.ecommerce.domain.Supplier
import org.springframework.data.jpa.repository.JpaRepository

interface SupplierRepo :JpaRepository<Supplier, Int> {
}