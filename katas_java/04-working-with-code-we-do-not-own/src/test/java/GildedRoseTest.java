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

    @Test
    public void should_not_let_quality_go_below_zero() {
        Item item = new Item("ITEM", 0,0);

        shop.updateInventory(item);

        assertThat(item.quality).isEqualTo(0);
    }

    @Test
    public void should_increase_quality_of_aged_Brie_the_older_it_gets() {
        Item item = new Item("agedBrie", 2, 4);;

        shop.updateInventory(item);

        assertThat(item.quality).isEqualTo(5);
    }

    @Test
    public void should_never_decrease_quality_when_item_is_Sulfuras() {
        Item item = new Item("Sulfuras", 2,5);

        shop.updateInventory(item);

        assertThat(item.quality).isEqualTo(5);
    }
}
