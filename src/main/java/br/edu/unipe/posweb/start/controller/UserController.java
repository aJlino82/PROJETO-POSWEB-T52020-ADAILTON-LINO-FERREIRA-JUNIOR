package br.edu.unipe.posweb.start.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unipe.posweb.model.User;
import br.edu.unipe.posweb.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user")
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@PostMapping("/user")
	public User save(@RequestBody @Valid User user) {
		user = userRepository.save(user);
		return user;
	}

}
