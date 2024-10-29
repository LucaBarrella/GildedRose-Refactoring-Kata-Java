package com.gildedrose;

public class ItemUpdaterFactory {

    public static ItemUpdater createItemUpdater(Item item) {
        
        switch (item.name) {

            case "Aged Brie":
                return new AgedBrieItemUpdater(item);

            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassItemUpdater(item);

            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItemUpdater(item);

            case "Conjured Mana Cake":
                return new ConjuredItemUpdater(item);

            default:
                return new RegularItemUpdater(item);
        }
    }
}
