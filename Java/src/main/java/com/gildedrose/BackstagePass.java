package com.gildedrose;

public class BackstagePass extends BaseItem {

    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (maxQualityNotReached()) {
            increaseQuality();
            increaseQualityIfSellInLessThanEleven();
            increaseQualityIfSellInLessThanSix();
        }
    }
    
    @Override
    public void updateQualityAfterSellIn() {
        item.quality = 0;
    }
    
    private void increaseQuality() {
        item.quality++;
    }

    private void increaseQualityIfSellInLessThanSix() {
        if (item.sellIn < 6 && maxQualityNotReached()) {
            increaseQuality();
        }
    }

    private void increaseQualityIfSellInLessThanEleven() {
        if (item.sellIn < 11 && maxQualityNotReached()) {
            increaseQuality();
        }
    }   
}
