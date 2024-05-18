package org.com.iesam.digitallibrary.domain;

public class NewUserUseCase {



        public NewUserUseCase( UserRepository userrepository) {

        }
        static void execute(User user) {
            UserRepository.newUser(user);
        }


}


