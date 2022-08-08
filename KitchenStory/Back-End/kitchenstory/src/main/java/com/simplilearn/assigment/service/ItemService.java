package com.simplilearn.assigment.service;

import java.util.List;

import com.simplilearn.assigment.model.Item;

public interface ItemService {
	public List<Item> findAll();
	public Item save(Item theItem);
	public Item findById(long theItem);
	public void deleteById(long theItem);
}
