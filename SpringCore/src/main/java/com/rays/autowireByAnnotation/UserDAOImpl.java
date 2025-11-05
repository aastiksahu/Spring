package com.rays.autowireByAnnotation;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAOInt {

	@Override
	public void add() {
		System.out.println("add method...");

	}

}
