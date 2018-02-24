package core.dto.model.catalog.product;

/**
 * @author DucBa
 */
public class AttributeValue {
    private long id;
    private Attribute attribute;
    private String name;

    public AttributeValue() {
    }

    public AttributeValue(long id, Attribute attribute, String name) {
        this.id = id;
        this.attribute = attribute;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
