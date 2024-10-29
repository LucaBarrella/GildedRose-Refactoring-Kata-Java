package com.gildedrose;

public class AgedBrieItemUpdater extends AbstractUpdater {

    public AgedBrieItemUpdater(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        incrementQuality();
    }

    @Override
    public void updateQualityAfterSellIn() {
        incrementQuality();
    }

}
