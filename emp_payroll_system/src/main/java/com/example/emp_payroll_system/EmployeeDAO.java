package com.example.emp_payroll_system;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAO {

    private SessionFactory sessionFactory;

    public EmployeeDAO() {
        sessionFactory = Utility.getSessionFactory();
    }

    private Session getSession() {
        return sessionFactory.openSession();
    }

    // Save Product
    public void save(Employee e) {
        Session session = getSession();

        Transaction tx = session.beginTransaction();

        session.persist(e);

        tx.commit();
        session.close();
    }

    // Find Product By Id
    public Employee findById(int id) {
        Session session = getSession();

        Employee e = session.find(Employee.class, id);

        session.close();

        return e;
    }

    // Find All Products
    public List<Employee> findAll() {
        Session session = getSession();

        List<Employee> employee =
                session.createQuery("from Employee", Employee.class)
                       .list();

        session.close();

        return employee;
    }

    // Update Product
    public void update(Employee e) {
        Session session = getSession();

        Transaction tx = session.beginTransaction();

        session.merge(e);

        tx.commit();
        session.close();
    }

    // Delete Product
    public void delete(int id) {
        Session session = getSession();

        Transaction tx = session.beginTransaction();

        Employee e = session.find(Employee.class, id);

        if (e != null) {
            session.remove(e);
        }

        tx.commit();
        session.close();
    }
}