package com.example.ntierdemo.apis;

import com.example.ntierdemo.viewmodels.CustomerCreateViewModel;
import com.example.ntierdemo.viewmodels.CustomerUpdateViewModel;
import com.example.ntierdemo.viewmodels.CustomerViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerApi {

    @GetMapping
    public ResponseEntity<List<CustomerViewModel>> getAll() {

    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerViewModel> getById(@PathVariable int id) {

    }

    @PostMapping
    public ResponseEntity<CustomerViewModel> create(@RequestBody CustomerCreateViewModel viewModel) {

    }

    @PutMapping("{id}")
    public ResponseEntity<CustomerViewModel> update(@PathVariable int id, @RequestBody CustomerUpdateViewModel viewModel) {

    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {

    }
}
