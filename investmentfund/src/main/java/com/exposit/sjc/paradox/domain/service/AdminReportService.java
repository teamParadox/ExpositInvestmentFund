package com.exposit.sjc.paradox.domain.service;

import java.util.List;

import com.exposit.sjc.paradox.domain.model.*;

public interface AdminReportService {
	
	public List<Statement> getSatysfyingStatement(List<Statement> stmnt);
	
	public List<Statement> getFinancedStatement(List<Statement> stmnt);
	
	public List<Project> getFinancedNotCompletedProject(List<Project> project);
	
}
