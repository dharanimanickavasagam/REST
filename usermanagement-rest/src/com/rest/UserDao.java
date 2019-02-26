package com.rest;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
	public List<User> getAllUsers() {

		List<User> userList = null;

		userList = new ArrayList<User>();
		userList.add(new User(1, "Mahesh", "Teacher"));
		userList.add(new User(2, "Dharani", "Coder"));

		for (User user : userList) {
			System.out.println(user.getName());
		}
		return userList;
	}

	public Object getSpecifiedUser(int id) {
		List<User> userToFind = getAllUsers();

		int searchID = id;
		String result = null;

		for (User user : userToFind) {
			if (searchID == user.getId()) {
				result = "found";
				return user;
			}
		}
		return result;
	}
}