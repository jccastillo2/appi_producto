package com.Jeanky.tienda.controller

import com.Jeanky.tienda.model.Product
import com.Jeanky.tienda.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ProductController {
    @Autowired
    lateinit var productService: ProductService

    @GetMapping
    fun list(): List<Product>{
        return productService.list()
    }
}