package com.Jeanky.tienda.controller

import com.Jeanky.tienda.model.Client
import com.Jeanky.tienda.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/client")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ClienteController {
    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list(): List<Client>{
        return clientService.list()
    }
    @PostMapping
    fun  save (@RequestBody cliente: Client):Client{
        return clientService.save(cliente)
    }
    @PutMapping
    fun update (@RequestBody cliente: Client):Client{
        return clientService.update(cliente)
    }

    @PatchMapping
    fun updateDescription (@RequestBody cliente: Client):Client{
        return clientService.updateDescription(cliente)
    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return clientService.delete(id)
    }

}
