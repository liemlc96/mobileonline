package core.dto.model.employee;

import core.dto.model.common.Account;

import java.util.Date;

/**
 * @author DucBa
 */
public class EmployeeAccount extends Account{
    private long id;
    private Role role;

    public EmployeeAccount() {
    }

    public EmployeeAccount(String username, String password) {
        super(username, password);
    }

    public EmployeeAccount(long id, Role role, String username, String email,
                           String password, Date createTime, Date lastAccess, boolean active) {
        super(username, email, password, createTime, lastAccess, active);
        this.id = id;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
