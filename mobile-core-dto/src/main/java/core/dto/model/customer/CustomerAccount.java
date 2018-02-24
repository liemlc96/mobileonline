package core.dto.model.customer;

import core.dto.model.common.Account;

import java.util.Date;

/**
 * @author DucBa
 */
public class CustomerAccount extends Account{
    private long id;
    private String slPassword;
    private String question;
    private String answer;

    public CustomerAccount() {
    }

    public CustomerAccount(String username, String password) {
        super(username, password);
    }

    public CustomerAccount(long id, String username, String email,
                           String password, Date createTime, Date lastAccess,
                           boolean active, String slPassword, String question, String answer) {
        super(username, email, password, createTime, lastAccess, active);
        this.id = id;
        this.slPassword = slPassword;
        this.question = question;
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getslPassword() {
        return slPassword;
    }

    public void setslPassword(String slPassword) {
        this.slPassword = slPassword;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
