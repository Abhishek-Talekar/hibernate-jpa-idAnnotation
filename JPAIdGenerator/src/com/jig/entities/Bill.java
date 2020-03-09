package com.jig.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "bill")
public class Bill implements Serializable{
	@Id
	@Column(name = "bill_no")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(generator = "bill_seq")
	//@SequenceGenerator(name = "bill_seq", sequenceName = "bill_sequence", initialValue = 1,allocationSize = 10)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(generator = "pk_tab")
	@TableGenerator(name = "pk_tab", table = "pk_new_table", pkColumnName = "table_nm", valueColumnName = "pk_values", pkColumnValue = "bill")
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
