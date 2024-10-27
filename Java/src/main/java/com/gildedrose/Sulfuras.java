package com.gildedrose;

public class Sulfuras extends BaseItem {

    public Sulfuras(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        // Sulfuras never changes
    }

    @Override
    public void updateQualityAfterSellIn() {
        // Sulfuras never changes
    }
    
}
