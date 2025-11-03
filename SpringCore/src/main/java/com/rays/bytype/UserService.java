package com.rays.bytype;

public class UserService {

	private UserDAOInt userDao;

	public void setUserDaoInt(UserDAOInt userDao) {
		this.userDao = userDao;
	}

	public void testAdd() {
		userDao.add();
	}

}
