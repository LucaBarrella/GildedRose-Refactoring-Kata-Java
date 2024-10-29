package com.gildedrose;

public class SellInUpdater {
    private final Item item;

    public SellInUpdater(Item item) {
        this.item = item;
    }

    public void decreaseDaysToSell() {
        item.sellIn--;
    }

    public boolean isExpired() {
        return item.sellIn < 0;
    }
}