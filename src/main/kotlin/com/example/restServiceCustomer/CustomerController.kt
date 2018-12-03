package com.example.restServiceCustomer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController(
        private val customerDao: CustomerDao
) {
    @GetMapping("/{id}")
    fun getCustomerById(@PathVariable("id") id: String): Customer? {
        System.out.println("Getting customer $id")
        return customerDao.getCustomerById(id)
    }
}