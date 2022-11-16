package com.example.demo.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Offers {
	
	@Id
	private int planId;
	private int validity;
	private int talktime;
	private String data;
	private int price;
	@ManyToOne
	
	private Operator operator;
	
	public Offers(int planId, int validity, int talktime, String data, int price, Operator operator) {
		super();
		this.planId = planId;
		this.validity = validity;
		this.talktime = talktime;
		this.data = data;
		this.price = price;
		this.operator = operator;
	}

	
	public Offers() {
		super();
	}


	public int getPlanId() {
		return planId;
	}


	public void setPlanId(int planId) {
		this.planId = planId;
	}


	public int getValidity() {
		return validity;
	}


	public void setValidity(int validity) {
		this.validity = validity;
	}


	public int getTalktime() {
		return talktime;
	}


	public void setTalktime(int talktime) {
		this.talktime = talktime;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Operator getOperator() {
		return operator;
	}


	public void setOperator(Operator operator) {
		this.operator = operator;
	}


	@Override
	public String toString() {
		return "Offers [planId=" + planId + ", validity=" + validity + ", talktime=" + talktime + ", data=" + data
				+ ", price=" + price + "]";
	}	
	
	
}
