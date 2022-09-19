package example.camunda.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import example.camunda.domain.User;
import example.camunda.domain.UserRepository;

/**
 * Created by ashlah on 28/07/17.
 */
@Service
@Transactional
public class UserService {

	private final UserRepository repository;

	@Autowired
	public UserService(UserRepository repository) {
		this.repository = repository;
	}

	public User findById(String id) {
		return repository.findById(id).get();
	}

	public Collection<User> findAll() {
		return (Collection<User>) repository.findAll();
	}

	public User save(User user) {
		return repository.save(user);
	}
}
