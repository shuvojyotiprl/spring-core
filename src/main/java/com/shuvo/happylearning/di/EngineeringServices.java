package com.shuvo.happylearning.di;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EngineeringServices implements ProfessionalServices {
	
	
	private String decepline;
	private List<String> subcategories;
	private List<Academics> academics;
	private Map<String,Integer> academicOpenings;
	
	
	EngineeringServices(String decepline){
		this.decepline = decepline;
	}
	
	EngineeringServices(String decepline , List<String> subcategories){
		this(decepline);
		this.subcategories = subcategories;
	}
	
	EngineeringServices(String decepline , List<String> subcategories, List<Academics> academics){
		this(decepline,subcategories);
		this.academics = academics;
	}
	
	EngineeringServices(String decepline , List<String> subcategories, List<Academics> academics, Map<String,Integer> academicOpenings){
		this(decepline,subcategories,academics);
		this.academicOpenings = academicOpenings;
	}
	
	@Override
	public void serve() {
		// TODO Auto-generated method stub
		System.out.println("****Engineering Service ***");
		
		System.out.println("TYPE : "+this.decepline);
		
		System.out.println("***** Sub categories *****");
		
		Stream.of(this.subcategories).forEach(System.out::println);
		
		System.out.println("**** Academics Required ******");
		
		Stream.of(this.academics).forEach(System.out::println);
		
		System.out.println("**** Academic Openings ******");
		
		for(Map.Entry<String,Integer> me : this.academicOpenings.entrySet()) {
			System.out.println(" "+me.getKey()+"  <----> "+me.getValue());
		}
		
		
	}

}
