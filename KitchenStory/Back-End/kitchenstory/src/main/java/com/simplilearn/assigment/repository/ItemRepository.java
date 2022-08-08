package com.simplilearn.assigment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.assigment.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
