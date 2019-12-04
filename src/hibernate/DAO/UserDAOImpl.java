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
    public List<Users> getUsers() {
        Session session = factory.getCurrentSession();

        List<Users> list = session.createQuery("from Users", Users.class).getResultList();

        return list;
    }

    @Override
    public void createUsers(Users users) {
        Session session = factory.getCurrentSession();

        session.saveOrUpdate(users);
    }

    @Override
    public Users getUsers(int userID) {
        Session session = factory.getCurrentSession();

        return session.get(Users.class, userID);
    }


    @Override
    public void deleteUser(int userID) {
        Session session = factory.getCurrentSession();

        Query query = session.createQuery("delete from Users where id = :doomedUserID");

        query.setParameter("doomedUserID", userID);

        query.executeUpdate();
    }

    @Override
    public List<Users> getUsersByName(String theSearchTerm) {
        Session session = factory.getCurrentSession();

        Query<Users> query = session.createQuery("from Users where lower(lastName) like :searchTerm");

        theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

        query.setParameter("searchTerm", theSearchTerm);

        return query.getResultList();
    }
}
