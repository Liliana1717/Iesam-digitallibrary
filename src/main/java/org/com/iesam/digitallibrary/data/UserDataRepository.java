package org.com.iesam.digitallibrary.data;

import org.com.iesam.digitallibrary.domain.User;
import org.com.iesam.digitallibrary.domain.UserRepository;

import java.util.List;

public class UserDataRepository implements UserRepository {


        private UserDataSource memDataSource;
        private UserDataSource fileDataSource;

        public UserDataRepository(UserDataSource memDataSource, UserDataSource fileDataSource) {
            this.memDataSource = memDataSource;
            this.fileDataSource = fileDataSource;
        }

        public User getUser(String userId) {
            User user = memDataSource.getUser(userId);
            if (user == null) {
                user = fileDataSource.getUser(userId);
                if (user != null) {
                    memDataSource.saveUser(user);
                }
            }
            return user;
        }

        @org.jetbrains.annotations.NotNull
        private List<User> getAllUsers() {
            List<User> users = memDataSource.getAllUsers();
            if (users.isEmpty()) {
                users = fileDataSource.getAllUsers();
                if (!users.isEmpty()) {
                    memDataSource.saveAllUsers(users);
                }
            }
            return users;
        }
    }

