package core.dto.model.catalog.product;

public class ProductRelationship {

    private long id;
    private Product product;
    private Product relatedProduct;
    private boolean active;

    public ProductRelationship() {
    }

    public ProductRelationship(long id, Product product, Product relatedProduct, boolean active) {
        this.id = id;
        this.product = product;
        this.relatedProduct = relatedProduct;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getRelatedProduct() {
        return relatedProduct;
    }

    public void setRelatedProduct(Product relatedProduct) {
        this.relatedProduct = relatedProduct;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
