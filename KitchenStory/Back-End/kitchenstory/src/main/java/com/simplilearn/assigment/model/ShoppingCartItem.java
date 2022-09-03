package com.simplilearn.assigment.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.decimal4j.util.DoubleRounder;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ShoppingCartItems")
public class ShoppingCartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long shoppingCartItemID;
	@ManyToOne
	@JoinColumn(name = "shoppingCartID", nullable = false)
	@JsonBackReference
	private ShoppingCart shoppingCart; 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "itemID", nullable = false)
	private Item item;
	private int quantity;
	private double lineTotal;
	
	public ShoppingCartItem() {}

	/**
	 * @param shoppingCart
	 * @param item
	 * @param quantity
	 * @param lineTotal
	 */
	public ShoppingCartItem(ShoppingCart shoppingCart, Item item, int quantity) {
		super();
		this.shoppingCart = shoppingCart;
		this.item = item;
		this.quantity = quantity;
		this.lineTotal = DoubleRounder.round((quantity*item.getPrice()),2);
	}

	public long getShoppingCartItemID() {
		return shoppingCartItemID;
	}

	public void setShoppingCartItemID(long shoppingCartItemID) {
		this.shoppingCartItemID = shoppingCartItemID;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.lineTotal = this.quantity*this.item.getPrice();
	}

	public double getLineTotal() {
		return lineTotal;
	}

	public void setLineTotal(double lineTotal) {
		this.lineTotal = lineTotal;
	}

	@Override
	public String toString() {
		return "ShoppingCartItem [shoppingCartItemID=" + shoppingCartItemID + ", item=" + item + ", quantity="
				+ quantity + ", lineTotal=" + lineTotal + "]";
	}	
}
