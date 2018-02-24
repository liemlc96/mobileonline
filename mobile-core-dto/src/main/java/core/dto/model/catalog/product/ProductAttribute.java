package core.dto.model.catalog.product;

/**
 * @author DucBa
 */
public class ProductAttribute {
    private Product product;
    private AttributeValue attribute;
    private float additionalPrice;

    public ProductAttribute() {
    }

    public ProductAttribute(Product product, AttributeValue attribute, float additionalPrice) {
        this.product = product;
        this.attribute = attribute;
        this.additionalPrice = additionalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public AttributeValue getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeValue attribute) {
        this.attribute = attribute;
    }

    public float getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(float additionalPrice) {
        this.additionalPrice = additionalPrice;
    }
}
