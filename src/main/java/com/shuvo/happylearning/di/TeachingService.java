package com.shuvo.happylearning.di;

import java.util.List;

public class TeachingService implements ProfessionalServices{
	
	
	private String type;
	
	private List<String> liSubjects;
	
	private List<Academics> liAcademics ;
	
	private Institution institute;

	public List<Academics> getLiAcademics() {
		return liAcademics;
	}


	public void setLiAcademics(List<Academics> liAcademics) {
		this.liAcademics = liAcademics;
	}


	public Institution getInstitute() {
		return institute;
	}


	public void setInstitute(Institution institute) {
		this.institute = institute;
	}


	public List<String> getLiSubjects() {
		return liSubjects;
	}


	public void setLiSubjects(List<String> liSubjects) {
		this.liSubjects = liSubjects;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public void serve() {
		// TODO Auto-generated method stub
		System.out.println("******* TEACHING SERVICE ****");
		System.out.println("TYPE -- > "+this.type);
		System.out.println("**** SUBJECTS ******");
		this.liSubjects.stream().forEach(System.out::println);
		System.out.println("*** Academics *****");
		this.liAcademics.forEach(System.out::println);
		System.out.println(this.institute);
	}

}
