package core.dto.model.catalog.product;

import core.dto.model.customer.Customer;

import java.util.Date;

/**
 * @author DucBa
 */
public class ProductReview {

    private long id;
    private float reviewRating;
    private Date reviewDate;
    private String reviewContent;
    private Customer customer;

    public ProductReview() {
    }

    public ProductReview(long id, float reviewRating, Date reviewDate, String reviewContent, Customer customer) {
        this.id = id;
        this.reviewRating = reviewRating;
        this.reviewDate = reviewDate;
        this.reviewContent = reviewContent;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(float reviewRating) {
        this.reviewRating = reviewRating;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
