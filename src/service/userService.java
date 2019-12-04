package service;

import hibernate.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface userService {

        List<Users> getUsers();

        void createUser(Users theUsers);

        Users getUser(int userID);

        void deleteUser(int userID);

        List<Users> getUserID(int UserID);
    }