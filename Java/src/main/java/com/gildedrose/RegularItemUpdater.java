package com.gildedrose;

public class RegularItemUpdater extends ItemUpdater {

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
