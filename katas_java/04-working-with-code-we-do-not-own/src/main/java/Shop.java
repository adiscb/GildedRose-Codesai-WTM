import items.Item;

public class Shop {
    public void updateInventory(Item item) {
        item.sellIn--;
        if ("agedBrie".equals(item.name)) {
            item.quality++;
        } else {
            item.quality--;
            if (item.sellIn < 0) {
                item.quality--;
            }
            if (item.quality < 0) item.quality = 0;
        }
    }
}
