package net.kzn.shoppingbackend.dao;


import net.kzn.shoppingbackend.dto.User;

public interface UserDAO {

	// user related operation
	User getByEmail(String email);
	User get(int id);

	boolean add(User user);
	


	
}
