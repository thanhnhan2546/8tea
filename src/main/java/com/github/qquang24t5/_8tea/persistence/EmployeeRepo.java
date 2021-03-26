package com.github.qquang24t5._8tea.persistence;

import com.github.qquang24t5._8tea.transference.Employee;
import io.cucumber.java.eo.Se;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class EmployeeRepo extends Repo {
    public void create(Employee e) {
        Session session = database.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(e);
        transaction.commit();
        session.close();
    }

    public List<Employee> readAll() {
        Session session = database.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("SELECT FROM Employee", Employee.class);
        List<Employee> employees = query.getResultList();
        transaction.commit();
        session.close();
        if (employees.isEmpty()) {
            return null;
        } else {
            return employees;
        }
    }

    public Employee readById(int id) {
        Session session = database.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM Employee WHERE id =: id", Employee.class);
        query.setParameter("id", id);
        List<Employee> employees = query.getResultList();
        transaction.commit();
        session.close();
        if(employees.isEmpty()) {
            return null;
        } else {
            return employees.get(0);
        }
    }

    public void update(Employee employee) {
        Session session = database.openSession();
        Transaction transaction = session.beginTransaction();

        Employee updatedEmployee = session.load(Employee.class, employee.getId());

        updatedEmployee.setDisabled(employee.getDisabled());
        updatedEmployee.setPassword(employee.getPassword());
        updatedEmployee.setMobile(employee.getMobile());
        updatedEmployee.setGender(employee.getGender());
        updatedEmployee.setPosition(employee.getPosition());
        updatedEmployee.setDateOfBirth(employee.getDateOfBirth());
        updatedEmployee.setName(employee.getName());

        session.update(updatedEmployee);
        transaction.commit();
        session.close();
    }

    public void delete(Employee employee) {
        Session session = database.openSession();
        Transaction transaction = session.beginTransaction();

        Employee deletedEmployee = session.load(Employee.class, employee.getId());

        deletedEmployee.setDisabled(true);

        session.update(deletedEmployee);
        transaction.commit();
        session.close();
    }

    public Employee findByPhoneNumber(String mobile) {
        Session session = database.openSession();
        Query query = session.createQuery("FROM Employee where mobile = :mobile");
        query.setParameter("mobile", mobile);

        List<Employee> employeeList = query.getResultList();

        if (employeeList.isEmpty()) {
            return null;
        } else {
            return employeeList.get(0);
        }
    }
}
