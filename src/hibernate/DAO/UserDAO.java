package hibernate.DAO;

import hibernate.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDAO {

    public void createUsers (Users user);

    Users getUsers(int userID);

    public void deleteUser(int userID);

    List<Users> getUsersByName(String theSearchTerm);

    List<Users> getUserList();
}

