package peaksoft.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.example.oneToOne.Passport;
import peaksoft.example.oneToOne.User;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Passport passport = new Passport();
        passport.setNumber("0001T");
        User user = new User("Uson", "Kamylov", 23);
        user.setPassport(passport);
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();


    }
}
