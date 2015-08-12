package com.exposit.sjc.paradox.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "comment_id")
	private Integer commentId;
	
	@Column(name = "comment_text")
	private String commentText;
	
	@Column(name = "comment_rating")
	private int commentRating;
	
	@Column(name = "comment_userlogin")
	private String userLogin;
	
	@Column(name = "comment_isnegative")
	private Boolean isNegative;

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public int getCommentRating() {
		return commentRating;
	}

	public void setCommentRating(int commentRating) {
		this.commentRating = commentRating;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public Boolean getIsNegative() {
		return isNegative;
	}

	public void setIsNegative(Boolean isNegative) {
		this.isNegative = isNegative;
	}
	
	
}
