package com.simplilearn.assigment.service;

import java.util.List;

import com.simplilearn.assigment.model.ShoppingCartItem;

public interface ShoppingCartItemService {
	public List<ShoppingCartItem> findAll();
	public ShoppingCartItem save(ShoppingCartItem theSC);
	public ShoppingCartItem findById(long theSC);
	public void deleteById(long theSC);
}
