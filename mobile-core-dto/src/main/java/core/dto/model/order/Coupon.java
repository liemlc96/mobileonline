package core.dto.model.order;

public class Coupon {
    private long id;
    private String code;
    private float sale;

    public Coupon() {
    }

    public Coupon(long id, String code, float sale) {
        this.id = id;
        this.code = code;
        this.sale = sale;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getSale() {
        return sale;
    }

    public void setSale(float sale) {
        this.sale = sale;
    }
}
