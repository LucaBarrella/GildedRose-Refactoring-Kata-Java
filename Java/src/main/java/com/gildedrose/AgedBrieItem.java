package com.gildedrose;

public class AgedBrieItem extends UpdatableItem {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new AgedBrieItemUpdateStrategy());
    }
}