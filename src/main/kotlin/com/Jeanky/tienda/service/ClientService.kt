package com.Jeanky.tienda.service

import com.Jeanky.tienda.model.Client
import com.Jeanky.tienda.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class ClientService {
    @Autowired
    lateinit var clientRepository: ClientRepository


    fun list(): List<Client> {

        return clientRepository.findAll()
    }

    fun save(cliente:Client):Client {
        return clientRepository.save(cliente)
    }

    fun update (cliente: Client):Client{
        return clientRepository.save(cliente)
    }

    fun updateDescription (cliente: Client):Client {
        val response = clientRepository.findById(cliente.id)
                ?: throw Exception()
        response.apply {
            this.id=cliente.id
        }
        return clientRepository.save(cliente)
    }

    fun delete (id:Long): Boolean{
        clientRepository.deleteById(id)
        return true
    }


}