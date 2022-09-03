package com.simplilearn.assigment.service;

import java.util.List;

import com.simplilearn.assigment.model.ShoppingCart;

public interface ShoppingCartService {
	public List<ShoppingCart> findAll();
	public ShoppingCart save(ShoppingCart theSC);
	public ShoppingCart findById(long theSC);
	public void deleteById(long theSC);
}
