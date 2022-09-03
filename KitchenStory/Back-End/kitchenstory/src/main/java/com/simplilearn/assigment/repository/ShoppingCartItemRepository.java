package com.simplilearn.assigment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.assigment.model.ShoppingCartItem;

public interface ShoppingCartItemRepository extends JpaRepository<ShoppingCartItem, Long> {

}
