package com.gildedrose;

// This interface is responsible for updating the quality of the items

public interface ItemUpdater {
    void update(Item item);

    // Todo: Create a protected method in the ItemUpdater interface that decrements the sellIn value of the item
    // default void decrementSellIn(Item item) {
    //     item.sellIn--;
    // }
}