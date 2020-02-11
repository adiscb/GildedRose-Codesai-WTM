import items.Item;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseTest {

    private Warehouse warehouse = new Warehouse();

    @Test
    public void should_decrease_sellin_days_at_the_end_of_each_day() {
        Item item = new Item("ITEM", 5, 10);

        warehouse.updateItemStatus(item);

        assertThat(item.sellIn).isEqualTo(4);
    }
}
