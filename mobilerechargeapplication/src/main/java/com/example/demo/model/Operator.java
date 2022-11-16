package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Operator {
	
	@Id
	@Column(name = "operatorid")
	private int oId;
	
	@Column(name = "operatorname")
	private String oName;
	
	@OneToMany(mappedBy = "operator")
	private List<Offers> offers;

	
	public Operator() {
		super();
	}


	public Operator(int oId, String oName) {
		super();
		this.oId = oId;
		this.oName = oName;
	}


	public int getoId() {
		return oId;
	}


	public void setoId(int oId) {
		this.oId = oId;
	}


	public String getoName() {
		return oName;
	}


	public void setoName(String oName) {
		this.oName = oName;
	}


	public List<Offers> getOffers() {
		return offers;
	}


	public void setOffers(List<Offers> offers) {
		this.offers = offers;
	}

	
}
