package com.gildedrose;

public class DefaultItemUpdater implements ItemUpdater {

    @Override
    public void update(Item item) {
        decrementSellIn(item);
        decreaseQuality(item);
        decreaseQualityAfterSellIn(item);
    }

    private void decrementSellIn(Item item) {
        item.sellIn--;
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    private void decreaseQualityAfterSellIn(Item item) {
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}