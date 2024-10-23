package com.gildedrose;

public class ConjuredUpdater implements ItemUpdater {

    @Override
    public void update(Item item) {
        decrementSellIn(item);
        item.quality -= 2;
        decreaseQualityAfterSellIn(item);
    }

    private void decrementSellIn(Item item) {
        item.sellIn--;
    }

    private void decreaseQualityAfterSellIn(Item item) {
        if (item.sellIn < 0) {
            item.quality -= 2;
        }
    }
}