package com.cg.onlineshopping.repository;

import com.cg.onlineshopping.entities.User;

public interface ILoginRepository {

	public User addUser(User user);
	public User removeUser(User user);
	public User validateUser(User user);
	public User signOut(User user);
}
