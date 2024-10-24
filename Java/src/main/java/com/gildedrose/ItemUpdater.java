package com.gildedrose;

public abstract class ItemUpdater {

    public void update(Item item) {
        decrementSellIn(item);
        updateQuality(item);
        updateQualityAfterSellIn(item);
    }

    protected void decrementSellIn(Item item) {
        item.sellIn--;
    }

    protected abstract void updateQuality(Item item);

    protected void updateQualityAfterSellIn(Item item) {
        // Default implementation does nothing
    }
}