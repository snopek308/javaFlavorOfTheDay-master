package hibernate.service;

import hibernate.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;


public interface userService {

        List<Users> getUserList();

        public void createUser(Users user);

        Users getUser(int userID);

        public void deleteUser(int userID);

        List<Users> getUserID(int UserID);

        List<Users> getUserByName(String theSearchTerm);
    }