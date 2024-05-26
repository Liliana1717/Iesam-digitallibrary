package org.com.iesam.digitallibrary.data;

import org.com.iesam.digitallibrary.domain.User;

import java.util.List;

public interface UserDataSource {
    void saveUser(User user);

    User getUser(String userId);

    List<User> getAllUsers();

    void saveAllUsers(List<User> users);


}
