package com.simplilearn.assigment.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="ShoppingCarts")
public class ShoppingCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ShoppingCartID;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID", nullable = false)
	@JsonManagedReference
	private User user;
	@OneToMany(mappedBy = "shoppingCart")
	private List<ShoppingCartItem> items; 
	
	public ShoppingCart() {}

	/**
	 * @param user
	 * @param items
	 */
	public ShoppingCart(User user, List<ShoppingCartItem> items) {
		super();
		this.user = user;
		this.items = items;
	}

	public Long getShoppingCartID() {
		return ShoppingCartID;
	}

	public void setShoppingCartID(Long shoppingCartID) {
		ShoppingCartID = shoppingCartID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ShoppingCartItem> getItems() {
		return items;
	}

	public void setItems(List<ShoppingCartItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [ShoppingCartID=" + ShoppingCartID + ", user=" + user + ", items=" + items + "]";
	}


	
}
