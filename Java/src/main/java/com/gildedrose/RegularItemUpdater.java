package com.gildedrose;

public class RegularItemUpdater extends AbstractUpdater {

    public RegularItemUpdater(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        decrementQuality();
    }

    @Override
    protected void updateQualityAfterSellIn() {
        decrementQuality();
    }

}
