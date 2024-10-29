package com.gildedrose;

public class SulfurasItem extends UpdatableItem {
    public SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new SulfurasItemItemUpdateStrategy());
    }
}