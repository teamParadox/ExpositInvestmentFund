package com.exposit.sjc.paradox.domain.service;

import java.util.List;

import com.exposit.sjc.paradox.domain.model.*;

public interface UserReportService {
	
	public List<Statement> getStatementOfArea(Area area);
	
	public List<Statement> getUserStatementsData(TaskUser user);
}
