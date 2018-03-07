package com.mallu.design.simpleFactory;

public class PDF implements Report {

	public PDF() {
		System.out.println("pdf report generated");
	}
	
	public Report getReportType(String type) {
		return new PDF();
	}

	public void parse() {
		System.out.println("pdf parsed..");
	}
}
