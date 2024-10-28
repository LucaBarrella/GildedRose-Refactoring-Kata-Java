package com.gildedrose;

public class Sulfuras extends AbstractItem {

    public Sulfuras(Item item) {
        super(item);
        item.quality = 80;
        item.sellIn = 0;
    }

    @Override
    public void updateQuality() {
        // Sulfuras never decreases in quality
    }

    @Override
    public void updateQualityAfterSellIn() {
        // Sulfuras never decreases in quality
    }

    @Override
    public void decrementSellIn() {
        // Sulfuras never decreases in sellIn
    }
    
}
