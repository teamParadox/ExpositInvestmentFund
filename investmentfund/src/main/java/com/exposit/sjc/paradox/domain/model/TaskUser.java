package com.exposit.sjc.paradox.domain.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class TaskUser extends BaseInfo {
	
	private List<Project> projects;
	
	private List<Statement> statements;
	
	private List<Comment> comments;
	
	private List<Recommendation> recommendations;

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Statement> getStatements() {
		return statements;
	}

	public void setStatements(List<Statement> statements) {
		this.statements = statements;
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
