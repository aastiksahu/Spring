package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestMultiXml {
	
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("multi.xml"));
		
		Person p = factory.getBean("person1", Person.class);
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		
		Employee e = (Employee) factory.getBean("employee");
		
		System.out.println(e.getEmpName());
		System.out.println(e.getSalary());
	}

}
