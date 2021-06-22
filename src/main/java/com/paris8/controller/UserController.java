package com.paris8.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paris8.models.Produit;
import com.paris8.models.User;
import com.paris8.repository.UserRepository;
@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;


	
	@PostMapping("/AddUser")
	public User add(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/update")
	public User update(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		userRepository.deleteById(id);
	}
	
	@GetMapping("/getAll")
	public List<User> getAll() {
		return userRepository.findAll();
	}
	@GetMapping("/getById/{id}")
	public Optional<User> getById(@PathVariable("id") int id) {
		return userRepository.findById(id);
	}
	@GetMapping("/getByUsername/{username}")
	public Optional<User> getByUsername(@PathVariable("username") String username) {
		return userRepository.findByUserName(username);
	}
}
