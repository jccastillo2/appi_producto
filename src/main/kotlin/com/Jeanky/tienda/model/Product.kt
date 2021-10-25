package com.Jeanky.tienda.model

import javax.persistence.*

@Entity
@Table(name = "Product")

class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var description: String? = null
}