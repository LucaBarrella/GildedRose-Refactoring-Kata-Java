package com.gildedrose;

public class AgedBrie extends AbstractItem {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        item.quality++;
    }

    @Override
    public void updateQualityAfterSellIn() {
        item.quality++;
    }
}