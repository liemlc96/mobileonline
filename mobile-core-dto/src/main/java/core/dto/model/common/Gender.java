package core.dto.model.common;

/**
 * @author DucBa
 */
public enum Gender {
    M("Male"),F("Female"),O("other"),;
    private String value;

    private Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
