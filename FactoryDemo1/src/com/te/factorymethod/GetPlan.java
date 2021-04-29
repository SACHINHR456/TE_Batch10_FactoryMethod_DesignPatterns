package com.te.factorymethod;

public class GetPlan {

	public Plan getPlan(String planType) {
		if(planType==null) {
		return null;
	}
		
		if(planType.equalsIgnoreCase("domesticplan")) {
		return new DomesticPlan();
		}
	
		if(planType.equalsIgnoreCase("commercialplan")) {
			return new CommercialPlan();
		}
		
		if(planType.equalsIgnoreCase("institutionalplan")) {
			return new InstitutionalPlan();
		}
		return null;
}
	
}
