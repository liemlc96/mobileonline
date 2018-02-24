package core.dto.model.employee;

import core.dto.model.common.Account;
import core.dto.model.common.Person;

/**
 * @author DucBa
 */
public class Employee extends Person{
    private long id;
    private Account account;
    private Role role;

    public Employee() {
    }

    public Employee(long id, Account account) {
        this.id = id;
        this.account = account;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

