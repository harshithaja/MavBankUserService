package com.mav.bank.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.mav.bank.user.entity.User;


public interface UserRepository extends CrudRepository<User, Integer>
{

}
