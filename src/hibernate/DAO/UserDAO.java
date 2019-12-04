package hibernate.DAO;

import hibernate.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDAO {
    List<Users> getUsers();

    void createUsers (Users user);

    Users getUsers(int userID);

    void deleteUser(int userID);

    List<Users> getUsersByName(String theSearchTerm);
}

