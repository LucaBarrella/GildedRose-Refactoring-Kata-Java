package com.gildedrose;

public class SulfurasItemItemUpdateStrategy extends AbstractItemUpdateStrategy {
    @Override
    public void updateQuality(Item item) {
        // Sulfuras never decreases in quality
    }

    @Override
    public void updateQualityAfterSellIn(Item item) {
        // Sulfuras never decreases in quality
    }

    @Override
    public void decreaseDaysToSell(Item item) {
        // Sulfuras never decreases in sellIn
        item.sellIn = 0;
    }
}