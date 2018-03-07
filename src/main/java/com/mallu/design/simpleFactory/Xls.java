package com.mallu.design.simpleFactory;

public class Xls implements Report{

	public Xls() {
		System.out.println("Xls report generated");
		}

	
	public Report getReportType(String type) {
		return new Xls();
	}
	
	public void parse(){
		System.out.println("xls parsed..");
	}
}
