package hibernate.service;


import hibernate.DAO.UserDAO;
import hibernate.entity.Users;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Service
public class userServiceImpl implements userService {
    // inject Donut DAO
    @Autowired
    private UserDAO userDAO;


    @Override
    @Transactional
    public List<Users> getUserList() {
        return userDAO.getUserList();
    }

    @Override
    @Transactional
    public void createUser(Users user) {
    userDAO.createUsers(user);
    }


    @Override
    @Transactional
    public Users getUser(int userID) { return userDAO.getUsers(userID); }

    @Override
    @Transactional
    public void deleteUser(int userID) {userDAO.deleteUser(userID);
    }

    @Override
    @Transactional
    public List<Users> getUserID(int UserID) {
        return null;
    }


    @Override
    @Transactional
    public List<Users> getUserByName(String theSearchTerm) {
        return userDAO.getUsersByName(theSearchTerm);
    }

}