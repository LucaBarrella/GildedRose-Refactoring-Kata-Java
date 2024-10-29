package com.gildedrose;

public class ConjuredItemUpdater extends AbstractUpdater {

    public ConjuredItemUpdater(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality(Item item) {
        decrementQuality(item, 2);
    }

    @Override
    protected void updateQualityAfterSellIn(Item item) {
        decrementQuality(item, 2);
    }

}
