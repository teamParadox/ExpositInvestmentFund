package com.exposit.sjc.paradox.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "operation")
public class Operation {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "operation_number")
	private Integer operationNumber;
	
	@Column(name = "operation_type")
	@Enumerated(EnumType.STRING)
	private OperationType type;
	
	@Column(name = "operation_senderAccountId")
	private int senderAccountId;
	
	@Column(name = "operation_recipiendAccountId")
	private int recipientAccountId;
 	
	public int getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(int number) {
		this.operationNumber = number;
	}
	
	public OperationType getOperationType() {
		return type;
	}

	public void setOperationType(OperationType type) {
		this.type = type;
	}
	
	public int getSenderAccountId() {
		return senderAccountId;
	}

	public void setSenderAccountId(int senderAccountId) {
	  this.senderAccountId = senderAccountId;
	}
	
	public int getRecipientAccountId() {
		return recipientAccountId;
	}

	public void setRecipientAccountId(int recipientAccountId) {
		this.recipientAccountId = recipientAccountId;
	}
	
	

}
