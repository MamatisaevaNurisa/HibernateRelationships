package peaksoft.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.example.oneToMany.Company;
import peaksoft.example.oneToMany.Employee;
import peaksoft.example.oneToOne.Passport;
import peaksoft.example.oneToOne.User;

public class HibernateUtil {
  private static SessionFactory buildSessionFactory() {
      SessionFactory sessionFactory = null;
      try {
          sessionFactory = new Configuration()
                  .configure("hibernate.cfg.xml")
                  .addAnnotatedClass(Company.class)
                  .addAnnotatedClass(Employee.class)
                  .buildSessionFactory();
      } catch (Exception e) {
          e.getStackTrace();
      }
      return sessionFactory;
  }
      public static SessionFactory getSessionFactory(){
          return buildSessionFactory();
      }


}
