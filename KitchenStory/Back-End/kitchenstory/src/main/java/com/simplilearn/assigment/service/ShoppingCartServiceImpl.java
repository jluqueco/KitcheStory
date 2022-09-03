package com.simplilearn.assigment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.assigment.model.ShoppingCart;
import com.simplilearn.assigment.repository.ShoppingCartRepository;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	/**
	 * 
	 */
	public ShoppingCartServiceImpl() {
		super();
	}

	/**
	 * @param shoppingCartRepository
	 */
	public ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository) {
		super();
		this.shoppingCartRepository = shoppingCartRepository;
	}



	@Override
	public List<ShoppingCart> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCart save(ShoppingCart theSC) {
		// TODO Auto-generated method stub
		return shoppingCartRepository.save(theSC);
	}

	@Override
	public ShoppingCart findById(long theSC) {
		// TODO Auto-generated method stub
		return shoppingCartRepository.findById(theSC).get();
	}

	@Override
	public void deleteById(long theSC) {
		// TODO Auto-generated method stub

	}

}
