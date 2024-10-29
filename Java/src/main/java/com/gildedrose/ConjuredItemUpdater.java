package com.gildedrose;

public class ConjuredItemUpdater extends ItemUpdater {

    public ConjuredItemUpdater(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        decrementQuality(2);
    }

    @Override
    protected void updateQualityAfterSellIn() {
        decrementQuality(2);
    }

}
