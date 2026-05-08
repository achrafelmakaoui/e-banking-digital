package com.elmakaoui.ebankingbackend.repositories;

import com.elmakaoui.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
