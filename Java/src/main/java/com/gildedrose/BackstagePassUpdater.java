package com.gildedrose;

public class BackstagePassUpdater implements ItemUpdater {

    @Override
    public void update(Item item) {
        decrementSellIn(item);
        increaseQuality(item);
        increaseQualityAfterTenDaysOrLess(item);
        increaseQualityAfterFiveDaysOrLess(item);
        qualityDropsToZeroAfterConcert(item);
    }

    private void decrementSellIn(Item item) {
        item.sellIn--;
    }

    private void increaseQuality(Item item) {
        if (!maxQualityCheck(item)) {
            item.quality++;
        }
    }

    private boolean maxQualityCheck(Item item) {
        return item.quality >= 50;
    }


    private void increaseQualityAfterTenDaysOrLess(Item item) {
        if (item.sellIn < 11 && !maxQualityCheck(item)) {
            item.quality++;
        }
    }

    private void increaseQualityAfterFiveDaysOrLess(Item item) {
        if (item.sellIn < 6 && !maxQualityCheck(item)) {
            item.quality++;
        }
    }

    private void qualityDropsToZeroAfterConcert(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
