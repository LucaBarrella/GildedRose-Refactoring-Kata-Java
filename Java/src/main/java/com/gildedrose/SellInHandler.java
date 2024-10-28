package com.gildedrose;

public abstract class SellInHandler {
    public void decrementSellIn(Item item) {
        item.sellIn--;
    }

    public boolean isExpired(Item item) {
        return item.sellIn < 0;
    }
}