package com.gildedrose;

public class AgedBrieItemUpdater extends AbstractUpdater {

    public AgedBrieItemUpdater(Item item) {
        super(item);
    }

    @Override
    public void updateQuality(Item item) {
        incrementQuality(item);
    }

    @Override
    public void updateQualityAfterSellIn(Item item) {
        incrementQuality(item);
    }

}
