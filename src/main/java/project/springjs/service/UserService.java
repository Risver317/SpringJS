package project.springjs.service;


import project.springjs.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    User getById(long id);

    void save(User user);

    void deleteById(long id);

    Optional<User> findByUsername(String username);

    void addDefaultUser();

    void update(User user);

    User passwordCoder(User user);
}
