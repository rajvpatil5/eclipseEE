package com.hibernate.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Bajaj {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int bid;
	private String Finance;
	private Dmart dmart;
	public Dmart getDmart() {
		return dmart;
	}
	public void setDmart(Dmart dmart) {
		this.dmart = dmart;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	private String Finserve;
	public String getFinance() {
		return Finance;
	}
	public void setFinance(String finance) {
		Finance = finance;
	}
	public String getFinserve() {
		return Finserve;
	}
	public void setFinserve(String finserve) {
		Finserve = finserve;
	}

}
