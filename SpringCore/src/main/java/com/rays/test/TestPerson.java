package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestPerson {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("person.xml"));

		Person p = (Person) factory.getBean("person");

		System.out.println(p.getName());
		System.out.println(p.getAddress());

		Person p1 = (Person) factory.getBean("person1");

		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
	}

}
