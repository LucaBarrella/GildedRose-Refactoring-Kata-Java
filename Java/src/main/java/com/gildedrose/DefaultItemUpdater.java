package com.gildedrose;

public class DefaultItemUpdater extends ItemUpdater {

    @Override
    protected void updateQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    @Override
    protected void updateQualityAfterSellIn(Item item) {
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}