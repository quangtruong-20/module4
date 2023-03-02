package com.example.customer.service;

import com.example.customer.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);


    void update(int id,Customer customer);
}
