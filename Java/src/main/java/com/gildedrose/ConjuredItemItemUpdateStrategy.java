package com.gildedrose;

public class ConjuredItemItemUpdateStrategy extends AbstractItemUpdateStrategy {
    @Override
    protected void updateQuality(Item item) {
        decrementQuality(item,2);
    }

    @Override
    protected void updateQualityAfterSellIn(Item item) {
        decrementQuality(item,2);
    }
}
