package core.dto.model.order;

import core.dto.model.customer.Customer;
import core.dto.model.shipping.Shipping;
import sun.dc.pr.PRError;

import java.util.Date;

/**
 * @author DucBa
 *
 */
public class Order {
    private long id;
    private Date dateOrderd;
    private Date lastModified;
    private int paymentType;
    private int status;
    private Coupon coupon;
    private Shipping shipping;
    private Customer customer;

    public Order() {
    }

    public Order(long id, Date dateOrderd, Date lastModified, int paymentType,
                 int status, Coupon coupon, Shipping shipping, Customer customer) {
        this.id = id;
        this.dateOrderd = dateOrderd;
        this.lastModified = lastModified;
        this.paymentType = paymentType;
        this.status = status;
        this.coupon = coupon;
        this.shipping = shipping;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateOrderd() {
        return dateOrderd;
    }

    public void setDateOrderd(Date dateOrderd) {
        this.dateOrderd = dateOrderd;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }
}
