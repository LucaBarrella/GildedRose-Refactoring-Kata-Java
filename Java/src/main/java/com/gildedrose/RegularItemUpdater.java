package com.gildedrose;

public class RegularItemUpdater extends AbstractUpdater {

    public RegularItemUpdater(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality(Item item) {
        decrementQuality(item);
    }

    @Override
    protected void updateQualityAfterSellIn(Item item) {
        decrementQuality(item);
    }

}
