package core.dto.model.catalog.product;

import core.dto.model.catalog.category.Category;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private long id;
    private String name;
    private String description;
    private List<ProductImage> images = new ArrayList<>();
    private List<ProductRelationship> relationships = new ArrayList<>();
    private Category category;
    private Manufacturer manufacturer;
    private float price;
    private int quantity;
    private boolean shipable;
    private float length;
    private float with;
    private float height;
    private float weight;
    private float ram;
    private float rom;

}
