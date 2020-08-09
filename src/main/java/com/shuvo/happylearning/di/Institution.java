package com.shuvo.happylearning.di;

public class Institution {
	private String instituteName;
	private String affiliatedUniversity;
	
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getAffiliatedUniversity() {
		return affiliatedUniversity;
	}
	public void setAffiliatedUniversity(String affiliatedUniversity) {
		this.affiliatedUniversity = affiliatedUniversity;
	}
	
	
	@Override
	public String toString() {
		return "Institution [instituteName=" + instituteName + ", affiliatedUniversity=" + affiliatedUniversity + "]";
	}
	
	
}
