package com.gildedrose;

public class SulfurasItemUpdater extends AbstractUpdater {

    public SulfurasItemUpdater(Item item) {
        super(item);
    }
    
    @Override
    protected void updateQuality() {
        // Do nothing
        //! NOTE: I don't know if the quality should be set to 0 or kept as is
        //!! NOTE 2: I don't know if the sellIn should be set to 0 or kept as is

        item.quality = 80;
        item.sellIn = 0;
    }

    @Override
    protected void updateQualityAfterSellIn() {
        // Do nothing
        //! NOTE: I don't know if the quality should be set to 0 or kept as is
    }

}
