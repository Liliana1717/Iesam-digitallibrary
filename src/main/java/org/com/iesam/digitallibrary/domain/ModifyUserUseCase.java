package org.com.iesam.digitallibrary.domain;
import java.util.ArrayList;
import java.util.List;
public class ModifyUserUseCase {


    private List<User> users;

    public ModifyUserUseCase(UserRepository userRepository) {
        this.users = new ArrayList<>();
        // Load users from the repository if needed
        // this.users = userRepository.findAll(); // Uncomment and implement this line as necessary
    }

    public String addNewUser(User user) {
        users.add(user);
        return "Usuario dado de alta con éxito";
    }

    public String modifyUser(String userId, String newId, String newName, String newEmail, String newAddress) {
        for (User user : users) {
            if (user.getId().equals(userId)) { // Use .equals for string comparison
                user.setId(newId);
                user.setName(newName);
                user.setEmail(newEmail);
                user.setAddress(newAddress);
                return "Datos del usuario modificados exitosamente";
            }
        }
        return "Usuario no encontrado";
    }

}