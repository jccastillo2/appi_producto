package com.Jeanky.tienda.service

import com.Jeanky.tienda.model.Product
import com.Jeanky.tienda.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {
    @Autowired
    lateinit var productRepository: ProductRepository


    fun list(): List<Product> {

        return productRepository.findAll()
    }
}
