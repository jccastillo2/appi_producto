package com.Jeanky.tienda.model

import javax.persistence.*

@Entity
@Table(name = "Cliente")

class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var Nombre: String? = null

}