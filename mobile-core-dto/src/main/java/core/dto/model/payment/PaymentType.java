package core.dto.model.payment;

/**
 * @author DucBa
 */
public enum PaymentType {
    CREDITCARD("creditcard"), COD("cod"), PAYPAL("paypal");

    private String value;

    private PaymentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
