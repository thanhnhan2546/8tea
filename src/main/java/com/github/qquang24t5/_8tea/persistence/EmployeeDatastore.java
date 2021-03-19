package com.github.qquang24t5._8tea.persistence;

import com.github.qquang24t5._8tea.transference.Employee;

public class EmployeeDatastore {

    private static EmployeeDatastore instance;

    private EmployeeDatastore() {}

    public static EmployeeDatastore getInstance() {
        if (instance == null)
            instance = new EmployeeDatastore();
        return instance;
    }

    public static void autofill(Employee e) {
        throw new UnsupportedOperationException();
    }

    public void create(Employee e) {
        throw new UnsupportedOperationException();
    }

    public Employee findByPhoneNumber(String phoneNumber) {
        throw new UnsupportedOperationException();
    }

    public void forceDelete(Employee e) {
        throw new UnsupportedOperationException();
    }
}
