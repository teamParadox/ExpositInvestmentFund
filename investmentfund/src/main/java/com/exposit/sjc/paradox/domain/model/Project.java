package com.exposit.sjc.paradox.domain.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_projectId")
	private int projectId;
	
	@Column(name = "project_projectName")
	private String projectName;
	
	@Column(name = "project_user")
	private TaskUser user;
	
	@Column(name = "project_recommendationCount")
	private int recommnedationCount;
	
	@Column(name = "project_projectAccount")
	private Account projectAccount;
	
	@Column(name = "project_deadline")
	private Date deadline;
	
	@Column(name = "project_description")
	private String description;
	
	@Column(name = "project_projectArea")
	private Area projectArea;
	
	@Column(name = "project_startTime")
	private Date startTime;
	
	@OneToMany
	@JoinColumn(name = "projcet_recommendations")
	private List<Recommendation> recommendations;
	
	@OneToMany
	@JoinColumn(name = "projcet_comments")
	private List<Comment> comments;
	
	@Column(name = "project_status")
	@Enumerated(EnumType.STRING)
	private ProjectStatus status;
	
	public List<Comment> getComments() {
		return comments;
	}
	
	public Date getDeadline() {
		return deadline;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Account getProjectAccount() {
		return projectAccount;
	}
	
	public Area getProjectArea() {
		return projectArea;
	}
	
	public int getProjectId() {
		return projectId;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public List<Recommendation> getRecommendations() {
		return recommendations;
	}
	
	public int getRecommnedationCount() {
		return recommnedationCount;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public ProjectStatus getStatus() {
		return status;
	}
	
	public TaskUser getUser() {
		return user;
	}
	
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setProjectAccount(Account projectAccount) {
		this.projectAccount = projectAccount;
	}
	
	public void setProjectArea(Area projectArea) {
		this.projectArea = projectArea;
	}
	
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void setRecommendations(List<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}
	
	public void setRecommnedationCount(int recommnedationCount) {
		this.recommnedationCount = recommnedationCount;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public void setStatus(ProjectStatus status) {
		this.status = status;
	}
	
	public void setUser(TaskUser user) {
		this.user = user;
	}
	
	
	
}
