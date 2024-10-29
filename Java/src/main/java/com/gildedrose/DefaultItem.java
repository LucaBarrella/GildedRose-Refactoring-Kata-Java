package com.gildedrose;

public class DefaultItem extends UpdatableItem {
    public DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new DefaultItemUpdateStrategy());
    }
}