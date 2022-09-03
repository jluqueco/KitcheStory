package com.simplilearn.assigment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.assigment.model.ShoppingCart;
import com.simplilearn.assigment.model.ShoppingCartItem;
import com.simplilearn.assigment.repository.ShoppingCartItemRepository;

@Service
public class ShoppingCartItemServiceImpl implements ShoppingCartItemService {

	@Autowired
	private ShoppingCartItemRepository sCIR;
	
	@Override
	public List<ShoppingCartItem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCartItem save(ShoppingCartItem theSC) {
		// TODO Auto-generated method stub
		return sCIR.save(theSC);
	}

	@Override
	public ShoppingCartItem findById(long theSC) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long theSC) {
		// TODO Auto-generated method stub

	}

}
