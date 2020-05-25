package com.ssm.dao;

import com.ssm.domain.User;

public interface  UserDao {
	 public abstract User findByUsername(String username);
}
