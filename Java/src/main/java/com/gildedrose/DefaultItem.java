package com.gildedrose;

public class DefaultItem extends AbstractItem {

    public DefaultItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        item.quality--;
    }

    @Override
    public void updateQualityAfterSellIn() {
        item.quality--;
    }

}