package be.sanming.chatter.backend.service;

import be.sanming.chatter.backend.model.User;

import java.util.List;

/**
 * Created by Yiua on 06/02/16.
 */
public interface UserService {
    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);
}
