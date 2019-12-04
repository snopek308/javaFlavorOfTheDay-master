package service;


import hibernate.entity.Users;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userServiceImpl implements userService {

    @Autowired
    private SessionFactory factory;

    @Override
    public List<Users> getUsers() {
        return null;
    }

    @Override
    public void createUser(Users theUsers) {

    }

    @Override
    public Users getUser(int userID) {
        return null;
    }

    @Override
    public void deleteUser(int userID) {

    }

    @Override
    public List<Users> getUserID(int UserID) {
        return null;
    }

}