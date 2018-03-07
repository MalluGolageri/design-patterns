package com.mallu.design.simpleFactory;

 interface  Report {
	 public Report getReportType(String type);
	 
	 void parse();
}
