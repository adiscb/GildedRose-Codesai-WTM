import items.Item;

public class Product {
    private Item item;

    public Product(Item item) {

        this.item = item;
    }

    public void decrementQuality() {
        if (item.quality > 0) {
            item.quality--;
        }

        if (item.sellIn < 0) {
            if (item.quality > 0) item.quality--;
        }
    }

    public void increaseQuality() {
        item.quality++;
    }

    public void decreaseSellIn() {
        item.sellIn--;

    }
}
