package com.gildedrose;

public class BackstagePassItemUpdater extends AbstractUpdater {

    public BackstagePassItemUpdater(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality(Item item) {
        incrementQuality(item);
        if (item.sellIn < 11) {
            incrementQuality(item);
        }
        if (item.sellIn < 6) {
            incrementQuality(item);
        }
    }

    @Override
    protected void updateQualityAfterSellIn(Item item) {
        item.quality = 0;
    }

}
