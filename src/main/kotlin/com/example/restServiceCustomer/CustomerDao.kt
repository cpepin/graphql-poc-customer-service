package com.example.restServiceCustomer

import org.springframework.stereotype.Component

@Component
class CustomerDao {
    private val data = mutableListOf(
            Customer(id = "1", name = "McDonalds", location = "New York"),
            Customer(id = "2", name = "Wendys", location = "Boston")
    )

    fun getCustomerById(id: String) = data.firstOrNull { customer -> customer.id == id }
}