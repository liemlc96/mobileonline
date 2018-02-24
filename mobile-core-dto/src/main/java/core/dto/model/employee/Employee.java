package core.dto.model.employee;

import core.dto.model.common.Account;

/**
 * @author DucBa
 */
public class Employee {
    private long id;
    private EmployeeAccount account;
    private float salary;

    public Employee() {
    }

    public Employee(long id, EmployeeAccount account, float salary) {
        this.id = id;
        this.account = account;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EmployeeAccount getAccount() {
        return account;
    }

    public void setAccount(EmployeeAccount account) {
        this.account = account;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

