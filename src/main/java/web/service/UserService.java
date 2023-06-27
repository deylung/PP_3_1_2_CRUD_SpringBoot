package web.service;


import web.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void deleteUser(User user);

    void updateUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
