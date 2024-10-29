package com.gildedrose;

public class AgedBrieItemUpdateStrategy extends AbstractItemUpdateStrategy {
    @Override
    protected void updateQuality(Item item) {
        incrementQuality(item);
    }

    @Override
    protected void updateQualityAfterSellIn(Item item) {
        incrementQuality(item);
    }
}