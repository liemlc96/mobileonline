package core.dto.model.customer;

import core.dto.model.common.*;

import java.util.Date;

/**
 * @author DucBa
 */
public class Customer extends Person {
    private long id;
    private CustomerAccount account;

    public Customer() {
    }

    public Customer(String firstName, String middleName, String lastName, Address address,
                    Gender gender, Date birthDay, long id, CustomerAccount account) {
        super(firstName, middleName, lastName, address, gender, birthDay);
        this.id = id;
        this.account = account;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CustomerAccount getAccount() {
        return account;
    }

    public void setAccount(CustomerAccount account) {
        this.account = account;
    }
}
