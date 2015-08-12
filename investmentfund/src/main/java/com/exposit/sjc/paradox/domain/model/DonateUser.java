package com.exposit.sjc.paradox.domain.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class DonateUser extends BaseInfo {

	private Integer accountId;
	
	private List<Comment> comments;
	
	private List<Recommendation> recommendations;
	
	private BaseInfo info;

	public BaseInfo getInfo() {
		return info;
	}
	
	public void setInfo(BaseInfo info) {
		this.info = info;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Recommendation> getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(List<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}
	
	
	
	
}
