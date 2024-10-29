package com.gildedrose;

public class DefaultItemUpdateStrategy extends AbstractItemUpdateStrategy {
    
    @Override
    protected void updateQuality(Item item) {
        decrementQuality(item);
    }

    @Override
    protected void updateQualityAfterSellIn(Item item) {
        decrementQuality(item);
    }
}
