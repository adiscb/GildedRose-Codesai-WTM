import items.Item;

public class Shop {
    public void updateInventory(Item item) {
        item.sellIn--;
        item.quality--;
        if(item.sellIn < 0) {
            item.quality--;
        }
    }
}
