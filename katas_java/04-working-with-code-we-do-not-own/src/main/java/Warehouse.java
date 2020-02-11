import items.Item;

public class Warehouse {
    public void updateItemStatus(Item item) {
        item.sellIn--;
    }
}
