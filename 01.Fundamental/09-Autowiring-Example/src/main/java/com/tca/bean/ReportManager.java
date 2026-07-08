
package com.tca.bean;

public class ReportManager 
{
	private ReportCreator reportCreator;
	
	public ReportManager(ReportCreator reportCreator)
	{
		this.reportCreator = reportCreator;
	}
	
	public void printReport()
	{
		reportCreator.createReport();
	}
}
