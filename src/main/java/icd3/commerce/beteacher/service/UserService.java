package icd3.commerce.beteacher.service;

import org.springframework.stereotype.Service;

import icd3.commerce.beteacher.entity.User;
import icd3.commerce.beteacher.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public User findByUsername(String username) {
		return userRepository.findByName(username);
	}

	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public String delete(User user) {
		userRepository.delete(user);
		return "Deleted";
	}
}
