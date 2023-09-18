package com.springtask1.bankingapp.repository;

import com.springtask1.bankingapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("select c from Customer c where c.email = :email")
    List<Customer> findByEmailWithQuery(String email);
    List<Customer> findByIdentityNo(Long identityNo);
}
