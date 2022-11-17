package com.example.demo.model;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Bill {
	
	@Id 
	@Column(name="TransactionId")
	@GeneratedValue(generator="trans_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name = "trans_seq",initialValue=10000,allocationSize=1)
	private  Long tId ;
	private long mobileNumber;
	private int offerId;
	
	public Bill() {
		super();
	}
	public Bill(int mobileNumber, int offerId) {
		super();
		this.mobileNumber = mobileNumber;
		this.offerId = offerId;
	}
	public Long gettId() {
		return tId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	@Override
	public String toString() {
		return "Bill [tId=" + tId + ", mobileNumber=" + mobileNumber + ", offerId=" + offerId + "]";
	}

}
