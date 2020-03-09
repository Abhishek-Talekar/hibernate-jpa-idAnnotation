package com.jig.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected int billNo;
	
	@Column(name = "biller_name")
	protected String billerName;
	
	@Column(name = "bill_date")
	protected Date billDate;
	
	@Column(name = "bill_amt")
	protected double billAmt;
	
	@Column(name = "customer_name")
	protected String customerName;

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public String getBillerName() {
		return billerName;
	}

	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", billerName=" + billerName + ", billDate=" + billDate + ", billAmt="
				+ billAmt + ", customerName=" + customerName + "]";
	}
	
	
}
