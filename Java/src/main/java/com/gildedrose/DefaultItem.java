package com.gildedrose;

public class DefaultItem extends BaseItem {

    public DefaultItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (maxQualityNotReached()) {
            item.quality--;
        }
    }

    @Override
    public void updateQualityAfterSellIn() {
        if (isExpired() && maxQualityNotReached()) {
            item.quality--;
        }
    }

}