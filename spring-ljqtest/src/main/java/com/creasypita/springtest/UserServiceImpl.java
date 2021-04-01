package com.creasypita.springtest;

/**
 * Created by lujq on 3/31/2021.
 */
public class UserServiceImpl implements UserService {

	@Override
	public String getName(String firstName, String lastName) {
		return String.format("I am %s%s", firstName, lastName);
	}
}
