package com.gildedrose;
public class Conjured extends AbstractItem {
    public Conjured(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        item.quality -= 2;
    }

    @Override
    public void updateQualityAfterSellIn() {
        item.quality -= 2;
    }
}