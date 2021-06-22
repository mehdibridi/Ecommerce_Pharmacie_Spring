package com.paris8.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paris8.models.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public  Optional<User> findByUserName(String userName);
}
