package com.gildedrose;

public class BackstagePassItem extends UpdatableItem {
    public BackstagePassItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality, new BackstagePassItemUpdateStrategy());
    }
}