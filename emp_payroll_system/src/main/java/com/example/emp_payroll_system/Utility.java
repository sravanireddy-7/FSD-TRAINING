package com.example.emp_payroll_system;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {

  private static SessionFactory sessionFactory;

  static {
      try {
          sessionFactory = new Configuration()
                  .configure("hibernate.cfg.xml")
                  .buildSessionFactory();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

  public static SessionFactory getSessionFactory() {
      return sessionFactory;
  }
}