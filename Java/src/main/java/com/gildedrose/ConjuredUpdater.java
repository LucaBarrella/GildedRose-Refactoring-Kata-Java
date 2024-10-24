package com.gildedrose;

public class ConjuredUpdater extends ItemUpdater {

    @Override
    protected void updateQuality(Item item) {
        if (item.quality > 0) {
            item.quality -= 2;
        }
    }

    protected void updateQualityAfterSellIn(Item item) {
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 2;
        }
    }
}