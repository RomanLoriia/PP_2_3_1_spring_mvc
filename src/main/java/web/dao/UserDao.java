package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(int id, String name, String lastName, int age);

    void removeUser(int id);

    User getUserById(int id);

    List<User> listUsers();

}
