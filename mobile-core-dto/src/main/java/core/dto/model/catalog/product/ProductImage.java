package core.dto.model.catalog.product;

/**
 * @author DucBa
 */
public class ProductImage {
    private long id;
    private String url;
    private String alter;
    private boolean isMain;
    private Product product;

    public ProductImage() {
    }

    public ProductImage(long id, String url, String alter, boolean isMain, Product product) {
        this.id = id;
        this.url = url;
        this.alter = alter;
        this.isMain = isMain;
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public boolean isMain() {
        return isMain;
    }

    public void setMain(boolean main) {
        isMain = main;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
