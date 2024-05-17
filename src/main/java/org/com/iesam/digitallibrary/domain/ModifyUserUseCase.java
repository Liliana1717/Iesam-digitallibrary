package org.com.iesam.digitallibrary.domain;
import java.util.ArrayList;
import java.util.List;
public class ModifyUserUseCase {

    public User users;


    public ModifyUserUseCase (UserRepository userrepository) {
List<User> users;
users = new ArrayList<>();

        }
 public String NewUser(User users) {
     users.add(users);

    return "usuario dado de alta con exito";
}

public Object modifyUser(String newId, String newName, String newEmail, String newAddress) {

    for (User us : users){
        if (us.getId() == userId) {
            us.setName(newName);
            us.setId(newId);
            us.setAddress(newAddress);
            return "datos del usuario modificado exitosamente";

        }

} return "usuario no encotrado";

}}