package com.gildedrose;

public class AgedBrie extends BaseItem {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (maxQualityNotReached()) {
            item.quality++;
        }
    }

    @Override
    public void updateQualityAfterSellIn() {
        if (isExpired()) {
            item.quality++;
        }
    }
}