package com.simplilearn.assigment.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "ITEMS")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemID;
	
	private String description;
	@OneToOne(
			fetch = FetchType.LAZY,
			optional = false
	)
	@PrimaryKeyJoinColumn
	protected Type type;
	private float price;
	
	/**
	 * @param description
	 * @param type
	 * @param price
	 */
	public Item(String description, Type type, float price) {
		super();
		this.description = description;
		this.type = type;
		this.price = price;
	}

	/**
	 * 
	 */
	public Item() {
		super();
	}

	public long getItemID() {
		return itemID;
	}

	public void setItemID(long itemID) {
		this.itemID = itemID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", description=" + description + ", type=" + type + ", price=" + price + "]";
	}
}
