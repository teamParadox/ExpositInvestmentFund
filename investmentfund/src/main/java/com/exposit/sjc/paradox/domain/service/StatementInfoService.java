package com.exposit.sjc.paradox.domain.service;

import java.util.List;

import com.exposit.sjc.paradox.domain.model.*;

public interface StatementInfoService {

	public List<Statement> GetStatements();
	
	public List<Statement> GetStatements(Area area);
	
	public void ChangeStatementStatus(Statement statement, StatementStatus newStatus );
	
}
