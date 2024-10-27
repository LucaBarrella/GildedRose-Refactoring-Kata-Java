package com.gildedrose;
public class Conjured extends BaseItem {
    public Conjured(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (maxQualityNotReached()) {
            item.quality -= 2;
        }
    }

    @Override
    public void updateQualityAfterSellIn() {
        if (isExpired() && maxQualityNotReached()) {
            item.quality -= 2;
        }
    }
}