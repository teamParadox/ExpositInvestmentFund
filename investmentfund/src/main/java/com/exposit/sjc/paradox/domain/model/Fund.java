package com.exposit.sjc.paradox.domain.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fund")
public class Fund {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fund_id")
	private int fundId;
	
	@OneToOne
	@JoinColumn(name = "fund_fundAccount")
	private Account fundAccount;
	
	@OneToMany
	@JoinColumn(name = "fund_fundsAreas")
	private List<FundArea> fundsAreas;
 
	public int getFundId() {
		return fundId;
	}
	
	public void setFundId(int fundId) {
		this.fundId = fundId;
	}
	
	public Account getFundAccount() {
		return fundAccount;
	}
	
	public void setFundAccount(Account fundAccount) {
		this.fundAccount = fundAccount;
	}
	
	public List<FundArea> getFundsAreas() {
		return fundsAreas;
	}
	
	public void setFundsAreas(List<FundArea> fundsAreas) {
		this.fundsAreas = fundsAreas;
	}
}
