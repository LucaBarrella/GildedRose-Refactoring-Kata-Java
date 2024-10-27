package com.gildedrose;

public class ItemFactory {

    public static Updateable createItem(Item item) {
        
        switch (item.name) {
            
            case "Aged Brie":
                return new AgedBrie(item);

            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePass(item);

            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(item);

            default:
                return new DefaultItem(item);

        }
    }
    
}
