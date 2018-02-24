package core.dto.model.shoppingcart;

import java.util.HashMap;

/**
 * @author DucBa
 */
public class ShoppingCart {
    private HashMap<Long, ShoppingCartItem> shoppingCart;

    public ShoppingCart() {
    }

    public ShoppingCart(HashMap<Long, ShoppingCartItem> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public HashMap<Long, ShoppingCartItem> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(HashMap<Long, ShoppingCartItem> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    /**
     * @param productId the product that you want to add to cart
     * @param item      the product and quantity those you want to add to cart
     */
    public void addToCart(long productId, ShoppingCartItem item) {
        //Have shoppingCart ever contains this product
        boolean check = shoppingCart.containsKey(productId);
        if (check) {
            //get old quantity
            int oldQuantity = shoppingCart.get(productId).getQuantity();
            //increase quantity
            item.setQuantity(oldQuantity + item.getQuantity());
            shoppingCart.put(productId, item);
        } else {
            shoppingCart.put(productId, item);
        }
    }

    /**
     * remove the product out of shopping cart
     *
     * @param productId the id of the product you want to remove
     */
    public void removeCart(long productId) {
        if (shoppingCart.containsKey(productId)) {
            shoppingCart.remove(productId);
        }
    }

    /**
     * @return number of item
     */
    public int countItem() {
        return shoppingCart.size();
    }
}
