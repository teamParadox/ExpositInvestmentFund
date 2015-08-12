package com.exposit.sjc.paradox.domain.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Director extends BaseModel {
	
	private List<Statement> statements;

	public List<Statement> getStatements() {
		return statements;
	}

	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}
	
	
}
