package com.Jeanky.tienda.repository

import com.Jeanky.tienda.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository:JpaRepository<Product,Long> {
    //interface WorkoutRepository:JpaRepository<Workout, Long> {}
}