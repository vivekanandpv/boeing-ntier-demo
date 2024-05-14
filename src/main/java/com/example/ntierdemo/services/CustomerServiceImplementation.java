package com.example.ntierdemo.services;

import com.example.ntierdemo.repositories.CustomerRepository;
import com.example.ntierdemo.viewmodels.CustomerCreateViewModel;
import com.example.ntierdemo.viewmodels.CustomerUpdateViewModel;
import com.example.ntierdemo.viewmodels.CustomerViewModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImplementation(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerViewModel> getAll() {
        return List.of();
    }

    @Override
    public CustomerViewModel getById(int id) {
        return null;
    }

    @Override
    public CustomerViewModel create(CustomerCreateViewModel viewModel) {
        return null;
    }

    @Override
    public CustomerViewModel update(int id, CustomerUpdateViewModel viewModel) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
