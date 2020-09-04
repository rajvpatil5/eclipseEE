package com.hibernate.spring;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Dmart {
	

	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
