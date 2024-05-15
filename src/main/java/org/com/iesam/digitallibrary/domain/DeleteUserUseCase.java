package org.com.iesam.digitallibrary.domain;

import org.com.iesam.digitallibrary.data.UserDataRepository;

public class DeleteUserUseCase{


    public DeleteUserUseCase(UserRepository userRepository) {


    }

    public DeleteUserUseCase(UserDataRepository userDataRepository) {
    }

    public void execute (String UserName){
        UserRepository.deleteUser(UserName);
    }

}


