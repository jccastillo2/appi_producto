package com.Jeanky.tienda.repository

import com.Jeanky.tienda.model.Client

import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository:JpaRepository<Client,Long> {
    fun findById (id:Long?):Client?
}
