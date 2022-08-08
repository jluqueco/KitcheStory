package com.simplilearn.assigment.resources;
import java.net.URI;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.simplilearn.assigment.model.Item;
import com.simplilearn.assigment.model.Type;
import com.simplilearn.assigment.model.User;
import com.simplilearn.assigment.service.ItemService;
import com.simplilearn.assigment.service.UserService;


@RestController
public class KitcheStoryResources {
	@Autowired
	private UserService userService;
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping(path="/items")
	public List<Item> getAllItems(){
		System.out.println("Printing all Items...");
		List<Item> items = itemService.findAll();
		System.out.println(items);
		return items;
	}
	
	@GetMapping(path = "/users")
	public List<User> getAllUsers(){
		List<User> users = userService.findAll();
		System.out.println("Method: getAllUsers()");
		System.out.println(users);
		return users;
	}
	
	@PostMapping(path = "/users/{username}")
	public ResponseEntity createUser(@PathVariable String username, @Validated @RequestBody User theUser ) {
		System.out.println("creating user: " + theUser);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userService.save(theUser).getUserID()).toUri();
		
		System.out.println(location.toString());
		
		return ResponseEntity.created(location).build();
	}
	
	@PostMapping(path = "/items/newitem")
	public ResponseEntity createItem(@Validated @RequestBody User theUser ) {
		Type type = new Type();
		type.setTypeID(5l);
		Item theItem = new Item("test item",type,500.00f);
		System.out.println("creating item: " + theItem);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(itemService.save(theItem).getItemID()).toUri();
		
		System.out.println(location.toString());
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping(path = "/items/{id}")
	public ResponseEntity deleteItem(@PathVariable long id) {
		itemService.deleteById(id);
		
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(path = "/user/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updatePassword(@PathVariable long id, String password) {
		
		System.out.println("Updating password to: " + password);
		User loadedUser = userService.findById(id);
		
		loadedUser.setPassword(password);
		
		userService.save(loadedUser);
	}

}
