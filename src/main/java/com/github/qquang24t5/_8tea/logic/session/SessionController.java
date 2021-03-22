package com.github.qquang24t5._8tea.logic.session;

import com.github.qquang24t5._8tea.helpers.Hasher;
import com.github.qquang24t5._8tea.persistence.EmployeeDatastore;
import com.github.qquang24t5._8tea.transference.Employee;

import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

public class SessionController {

    public static SessionController getInstance() {
        if (instance == null)
            instance = new SessionController();
        return instance;
    }

    private SessionController() {
    }

    public Set<LoginAction.Error> login(LoginAction loginAction) throws NoSuchAlgorithmException {
        Set<LoginAction.Error> errors = new HashSet<>();

        if (loginAction.getMobile().equals(""))
            errors.add(LoginAction.Error.EMPTY_MOBILE);
        if (loginAction.getPassword().equals(""))
            errors.add(LoginAction.Error.EMPTY_PASSWORD);

        if (errors.size() == 0) {
            Employee e = employeeDs.findByPhoneNumber(loginAction.getMobile());

            if (e == null
                    || Hasher.PasswordHasher.hash(loginAction.getPassword()).equals(e.getPassword())) {
                errors.add(LoginAction.Error.UNAUTHORIZED);
            }

        }

        if (errors.size() == 0) {

            currentEmployee = employeeDs.findByPhoneNumber(loginAction.getMobile());

        }

        return errors;
    }

    public Employee getCurrentEmployee() {
        return currentEmployee;
    }

    private static SessionController instance;
    private EmployeeDatastore employeeDs;
    private Employee currentEmployee;

}
