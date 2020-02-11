import items.Item;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseTest {

    private Shop shop = new Shop();

    @Test
    public void should_update_inventory_at_the_end_of_each_day() {
        Item item = new Item("ITEM", 5, 10);

        shop.updateInventory(item);

        assertThat(item.sellIn).isEqualTo(4);
        assertThat(item.quality).isEqualTo(9);
    }

    @Test
    public void should_degrade_quality_twice_once_sell_by_date_has_passed(){
        Item item = new Item("ITEM2", 0,10);

        shop.updateInventory(item);

        assertThat(item.quality).isEqualTo(8);
    }
    
}
