package org.com.iesam.digitallibrary.data.local;
import org.com.iesam.digitallibrary.data.UserDataSource;
import org.com.iesam.digitallibrary.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class UserMemLocalDataSource  implements UserDataSource {


        private HashMap<String, User> userCache = new HashMap<>();

        @Override
        public User getUser(String userId) {
            return userCache.get(userId);
        }

        @Override
        public List<User> getAllUsers() {
            return new ArrayList<>(userCache.values());
        }

        @Override
        public void saveUser(User user) {
            userCache.put(user.getId(), user);
        }

        @Override
        public void saveAllUsers(List<User> users) {
            for (User user : users) {
                userCache.put(user.getId(), user);
            }
        }




}


