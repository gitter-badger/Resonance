package edu.sjsu.services;

import org.springframework.stereotype.Component;

import edu.sjsu.models.User;

public interface UserService {

	public User create(User user);

}