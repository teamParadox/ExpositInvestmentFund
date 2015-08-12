package com.exposit.sjc.paradox.domain.service;

public interface ReplenishmentService {

	public void FromCard(String CardInfo ,int Amount );
	
	public void FromCheck(String CheckInfo ,int Amount );
	
	public void FromTransfer(String TransferInfo,int Amount);
	
}
