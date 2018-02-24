package core.dto.model.order;

import core.dto.model.common.Address;
import core.dto.model.customer.Customer;
import core.dto.model.payment.PaymentType;
import core.dto.model.shipping.Shipping;

import java.util.Date;

/**
 * @author DucBa
 *
 */
public class Order {
    private long id;
    private Customer customer;
    private Date dateOrderd;
    private Date lastModified;
    private PaymentType paymentType;
    private OrderStatus status;
    private Shipping shipping;

    public Order() {
    }

    public Order(long id, Customer customer, Date dateOrderd, Date lastModified,
                 PaymentType paymentType, OrderStatus status, Shipping shipping) {
        this.id = id;
        this.customer = customer;
        this.dateOrderd = dateOrderd;
        this.lastModified = lastModified;
        this.paymentType = paymentType;
        this.status = status;
        this.shipping = shipping;
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

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }
}
