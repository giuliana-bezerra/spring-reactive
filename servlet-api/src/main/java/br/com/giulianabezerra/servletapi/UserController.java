package br.com.giulianabezerra.servletapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  UserRepository userRepository;

  @PostMapping
  User create(@RequestBody User user) {
    return userRepository.save(user);
  }

  @GetMapping
  Iterable<User> list() {
    return userRepository.findAll();
  }
}
