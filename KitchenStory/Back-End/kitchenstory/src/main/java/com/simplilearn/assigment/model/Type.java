package com.simplilearn.assigment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TYPES")
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long typeID;
	
	private String description;

	/**
	 * 
	 */
	public Type() {
		super();
	}

	/**
	 * @param description
	 */
	public Type(String description) {
		super();
		this.description = description;
	}
	
	public long getTypeID() {
		return typeID;
	}

	public void setTypeID(long typeID) {
		this.typeID = typeID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Type [typeID=" + typeID + ", description=" + description + "]";
	}
}
