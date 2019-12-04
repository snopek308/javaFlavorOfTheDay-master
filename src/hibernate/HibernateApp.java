package hibernate;

import hibernate.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.List;

public class HibernateApp {

    //builds the factory for the hibernate app
    private SessionFactory factory;


    public HibernateApp() {
        factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Users.class)
                .buildSessionFactory();
    }

    //closes the factory
    public void close() {
        factory.close();
    }

    //sets up deleting the user
    private void deleteUser(int userID) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        /** DO CRUD **/
        Users aUser = session.get(Users.class, userID);
        if (aUser != null)
            session.delete(aUser);
        session.getTransaction().commit();
    }

    //updating the user account
    private void updateUser(int userID) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        /** DO CRUD **/
        Users aUser = session.get(Users.class, userID);
        if (aUser != null)
            aUser.setLastName(aUser.getLastName().toUpperCase());
        System.out.println(aUser);

        session.getTransaction().commit();
    }

    //reads the users entered
    private void readUser(int userID) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        /** DO CRUD **/
        Users aUser = session.get(Users.class, userID);

        System.out.println(aUser);

        session.getTransaction().commit();
    }


    //creates the new users
    private int createUser() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        /** DO CRUD **/

        Users user = new Users("Abby", "Snopek", "abby@abby.com");

        session.save(user);

        System.out.println(user);

        session.getTransaction().commit();

        return user.getUserID();
    }

}
