package com.gildedrose;

public class ItemFactory {
    public static UpdatableItem createItem(Item item) {

        switch (item.name) {
            
            case "Aged Brie":
            return new AgedBrieItem(item.name, item.sellIn, item.quality);
        
            case "Sulfuras, Hand of Ragnaros":
            return new SulfurasItem(item.name, item.sellIn, item.quality);
        
            case "Backstage passes to a TAFKAL80ETC concert":
            return new BackstagePassItem(item.name, item.sellIn, item.quality);
        
            case "Conjured Mana Cake":
            return new ConjuredItem(item.name, item.sellIn, item.quality);
        
            default:
            return new DefaultItem(item.name, item.sellIn, item.quality);
        }
    }
}