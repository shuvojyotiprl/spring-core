package com.shuvo.happylearning.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shuvo.hl.spb.bean.Tringle;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ProfessionalServices.xml");

		ProfessionalServices ps1 = (ProfessionalServices) context.getBean("ps1");
		ps1.serve();

		ProfessionalServices ps2 = (ProfessionalServices) context.getBean("ps2");
		ps2.serve();

		ApplicationContext context1 = new ClassPathXmlApplicationContext("AutowiringExample.xml");

		Tringle tringle = (Tringle) context1.getBean("tringle");

		System.out.println(tringle);
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("FactoryImpl.xml");
		
		MyObjectFactory factory = (MyObjectFactory) context2.getBean("fact1");
		
		System.out.println(factory);

	}
}
