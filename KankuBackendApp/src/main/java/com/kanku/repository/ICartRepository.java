package com.kanku.repository;

import com.kanku.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICartRepository extends JpaRepository<Cart,Long> {
    List<Cart> getAllByCustomerCustomerId(Long id);
}
