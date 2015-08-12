package com.exposit.sjc.paradox.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fundArea")
public class FundArea {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fundArea_fundAreaId")
	private Integer fundAreaId;
	
	@OneToOne
	@JoinColumn( name = "fundArea_fundAreaAccount")
	private Account fundAreaAccount;
	
	@Column(name = "fundArea_currentArea")
	@Enumerated(EnumType.STRING)
	private Area currentArea;
	
	public int getFundAreaId() {
		return fundAreaId;
	}
	
	public void setFundAreaId(int fundAreaId) {
		this.fundAreaId = fundAreaId;
	}
	
	public Account getFundAreaAccount() {
		return fundAreaAccount;
	}
	
	public void setFundAreaAccount(Account fundAreaAccount) {
		this.fundAreaAccount = fundAreaAccount;
	}
	
	public Area getCurrentArea() {
		return currentArea;
	}
	
	public void setCurrentArea(Area currentArea) {
		this.currentArea = currentArea;
	}
	
	
}
