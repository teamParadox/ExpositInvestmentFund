package com.exposit.sjc.paradox.domain.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_id")
	private int id;
	
	@Column(name = "account_balance")
	private double balance;
	
	@OneToMany
	@JoinColumn(name = "account_operations")
	private List<Operation> operations;
 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public List<Operation> getOperations() {
		return operations;
	}
	
	public void setOperations(List<Operation> operations)
	{
		this.operations = operations;
	}

}
