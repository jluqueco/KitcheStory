package com.simplilearn.assigment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.assigment.model.Item;
import com.simplilearn.assigment.repository.ItemRepository;
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	/**
	 * 
	 */
	public ItemServiceImpl() {
		super();
	}

	/**
	 * @param itemRepository
	 */
	public ItemServiceImpl(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public Item save(Item theItem) {
		// TODO Auto-generated method stub
		return itemRepository.save(theItem);
	}

	@Override
	public Item findById(long theItem) {
		// TODO Auto-generated method stub
		return itemRepository.findById(theItem).get();
	}

	@Override
	public void deleteById(long theItem) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(theItem);;
	}

}
