package com.gildedrose;

public class BackstagePass extends AbstractItem {

    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        increaseQualityIfSellInLessThanEleven();
        increaseQualityIfSellInLessThanSix();
    }
    
    private void increaseQuality() {
        item.quality++;
    }

    @Override
    public void updateQualityAfterSellIn() {
        item.quality = 0;
    }

    private void increaseQualityIfSellInLessThanSix() {
        if (item.sellIn < 6 && qualityValidator.checkQuality(item)) {
            increaseQuality();
        }
    }

    private void increaseQualityIfSellInLessThanEleven() {
        if (item.sellIn < 11 && qualityValidator.checkQuality(item)) {
            increaseQuality();
        }
    }   
}
