package hibernate.DAO;

import hibernate.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private SessionFactory factory;

    @Override
    public List<Users> getUserList() {
        //get current hibernate session
        Session session = factory.getCurrentSession();

        //get list of users from query
        List<Users> list = session.createQuery("from Users", Users.class).getResultList();

        //return results
        return list;
    }

    @Override
    public void createUsers(Users user) {
        //get current hibernate session
        Session session = factory.getCurrentSession();

        //save/update the user
        session.saveOrUpdate(user);
    }

    @Override
    public Users getUsers(int userID) {
        //get current hibernate session
        Session session = factory.getCurrentSession();

        return session.get(Users.class, userID);
    }


    @Override
    public void deleteUser(int userID) {
        //get current hibernate session
        Session session = factory.getCurrentSession();

        //delete object using primary key
        Query query = session.createQuery("delete from Users where id = :doomedUserID");

        //set parameter value
        query.setParameter("doomedUserID", userID);

        //perform the delete
        query.executeUpdate();
    }

    @Override
    public List<Users> getUsersByName(String theSearchTerm) {
        //get current hibernate session
        Session session = factory.getCurrentSession();

        //add wildcards and make search term lowercase for case insensitivity
        Query<Users> query = session.createQuery("from Users where lower(userID) like :searchTerm");

        theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

        query.setParameter("searchTerm", theSearchTerm);

        return query.getResultList();
    }
}
