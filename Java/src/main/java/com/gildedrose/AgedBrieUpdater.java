package com.gildedrose;

public class AgedBrieUpdater implements ItemUpdater {

    @Override
    public void update(Item item) {
        decrementSellIn(item);
        increaseQualityIfPossible(item);
        increaseQualityAfterSellInIfPossible(item);
    }

    private void decrementSellIn(Item item) {
        item.sellIn--;
    }

    private void increaseQualityIfPossible(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private void increaseQualityAfterSellInIfPossible(Item item) {
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}
