package service;

import hibernate.entity.Users;

import java.util.List;

public interface userService {

        List<Users> getUsers();

        void saveUser(Users theUsers);

        Users getUser(int userID);

        void deleteUser(int userID);

        List<Users> getUserID(int UserID);
    }