package core.dto.model.employee;

/**
 * @author DucBa
 */
public enum Role {
    SALE("sale"), STOCK("stoke"), ADMIN("admin"), SEO("seo"),;

    private String value;

    private Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
