package peaksoft.example.oneToMany;

import antlr.collections.impl.LList;
import org.hibernate.Session;
import peaksoft.example.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Employee employee = new Employee();
        employee.setName("Aibek");
        employee.setSalary(20000);

        Employee employee1 = new Employee();
        employee1.setName("Nurisa");
        employee1.setSalary(100000);

        Company company = new Company;
        company.setName("GOOGLE");
        employee1.setCompany(company);
        employee.setCompany(company);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        company.setEmployees(employeeList);
        session.beginTransaction();
        session.save(company);
        session.getTransaction().commit();
        session.close();


    }
}
