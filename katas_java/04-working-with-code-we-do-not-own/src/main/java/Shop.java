import items.Item;

public class Shop {
    public void updateInventory(Item item) {
        Product product = new Product(item);
        product.decreaseSellIn();
        if ("agedBrie".equals(item.name)) {
            product.increaseQuality();
        } else {
            if (!"Sulfuras".equals(item.name)) {
                product.decrementQuality();
            }

        }
    }
}
