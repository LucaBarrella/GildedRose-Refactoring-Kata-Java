package com.gildedrose;

public class AgedBrieUpdater implements ItemUpdater {

    @Override
    public void update(Item item) {
        decrementSellIn(item);
        increaseQuality(item);
        increaseQualityAfterSellIn(item);
    }

    private void decrementSellIn(Item item) {
        item.sellIn--;
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private void increaseQualityAfterSellIn(Item item) {
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}
