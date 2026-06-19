package com.example.studentinfo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDAO {

    private SessionFactory sessionFactory;

    public StudentDAO() {
        sessionFactory = Utility.getSessionFactory();
    }

    private Session getSession() {
        return sessionFactory.openSession();
    }

    // Save Product
    public void save(Student s) {
        Session session = getSession();

        Transaction tx = session.beginTransaction();

        session.persist(s);

        tx.commit();
        session.close();
    }

    // Find Product By Id
    public Student findById(int id) {
        Session session = getSession();

        Student s = session.find(Student.class, id);

        session.close();

        return s;
    }

    // Find All Products
    public List<Student> findAll() {
        Session session = getSession();

        List<Student> products =
                session.createQuery("from Student", Student.class)
                       .list();

        session.close();

        return products;
    }

    // Update Product
    public void update(Student s) {
        Session session = getSession();

        Transaction tx = session.beginTransaction();

        session.merge(s);

        tx.commit();
        session.close();
    }

    // Delete Product
    public void delete(int id) {
        Session session = getSession();

        Transaction tx = session.beginTransaction();

        Student s = session.find(Student.class, id);

        if (s != null) {
            session.remove(s);
        }

        tx.commit();
        session.close();
    }
}