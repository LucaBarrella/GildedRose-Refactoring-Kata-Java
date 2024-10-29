package com.gildedrose;

public class BackstagePassItemUpdater extends ItemUpdater {

    public BackstagePassItemUpdater(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        incrementQuality();
        if (item.sellIn < 11) {
            incrementQuality();
        }
        if (item.sellIn < 6) {
            incrementQuality();
        }
    }

    @Override
    protected void updateQualityAfterSellIn() {
        item.quality = 0;
    }

}
