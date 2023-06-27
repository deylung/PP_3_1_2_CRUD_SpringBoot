package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.repository.UserRepository;
import web.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveUser(User user) {
        repository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        repository.delete(user);
    }

    @Override
    public void updateUser(User user) {
        repository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
