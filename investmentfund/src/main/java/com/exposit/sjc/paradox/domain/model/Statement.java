package com.exposit.sjc.paradox.domain.model;

import java.util.Date;

public class Statement {
	
	private int statementId;
	
	private Area projectArea;
	
	private int projectId;
	
	private StatementStatus status;
	
	private Date submitionDate;
	
	private double wherewithal;
	
	private Date considerationTime;

	public int getStatementId() {
		return statementId;
	}

	public void setStatementId(int statementId) {
		this.statementId = statementId;
	}

	public Area getProjectArea() {
		return projectArea;
	}

	public void setProjectArea(Area projectArea) {
		this.projectArea = projectArea;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public StatementStatus getStatus() {
		return status;
	}

	public void setStatus(StatementStatus status) {
		this.status = status;
	}

	public Date getSubmitionDate() {
		return submitionDate;
	}

	public void setSubmitionDate(Date submitionDate) {
		this.submitionDate = submitionDate;
	}

	public double getWherewithal() {
		return wherewithal;
	}

	public void setWherewithal(double wherewithal) {
		this.wherewithal = wherewithal;
	}

	public Date getConsiderationTime() {
		return considerationTime;
	}

	public void setConsiderationTime(Date considerationTime) {
		this.considerationTime = considerationTime;
	}
	
	
}
