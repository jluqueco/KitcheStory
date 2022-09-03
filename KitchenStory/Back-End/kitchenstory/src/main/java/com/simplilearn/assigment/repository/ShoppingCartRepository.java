package com.simplilearn.assigment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.assigment.model.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {

}
