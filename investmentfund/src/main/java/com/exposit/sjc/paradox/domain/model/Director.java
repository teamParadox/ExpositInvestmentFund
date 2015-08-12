package com.exposit.sjc.paradox.domain.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Director  {
	
	private Integer DirectorId;
	
	private List<Statement> statements;
	
	private BaseInfo info;

	public BaseInfo getInfo() {
		return info;
	}
	
	public void setInfo(BaseInfo info) {
		this.info = info;
	}
	
	public List<Statement> getStatements() {
		return statements;
	}

	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}
	
	public Integer getDirectorId() {
		return DirectorId;
	}
	
	public void setDirectorId(Integer directorId) {
		DirectorId = directorId;
	}
	

	
	
}
