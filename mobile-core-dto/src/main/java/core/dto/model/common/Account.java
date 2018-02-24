package core.dto.model.common;

import java.util.Date;

/**
 * @author DucBa
 */
public class Account {
    private String username;
    private String email;
    private String password;
    private Date createTime;
    private Date lastAccess;
    private boolean active;

    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String username, String email, String password, Date createTime, Date lastAccess, boolean active) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.createTime = createTime;
        this.lastAccess = lastAccess;
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
