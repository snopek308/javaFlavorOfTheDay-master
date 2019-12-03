package service;


import DAO.UserDAO;
import hibernate.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<Users> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void saveUser(Users theUsers) {

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
