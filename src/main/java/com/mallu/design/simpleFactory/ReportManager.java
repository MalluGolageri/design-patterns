package com.mallu.design.simpleFactory;

public abstract class ReportManager implements Report {

	public ReportManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {				

	}


	public abstract Report getReportType(String type);

	static Report createReportType(String type){
		if(type.equals("pdf")) return new PDF();
		if(type.equals("xls")) return new Xls();
		return null;
	}

	@Override
	public void parse() {
		System.out.println("default report manager..");
	}
}
