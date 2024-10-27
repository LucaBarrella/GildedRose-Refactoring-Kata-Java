package com.gildedrose;

/*
--------------------------------------------
General Rules for default items: //! Done

1) Decrease the quality of the item by 1 each day
2) When a product has passed its sell by date (sellIn <= 0), decrease the quality by 2 each day
3) The quality of an item is never negative and never more than 50

--------------------------------------------

Specific Rules:

1) Aged Brie increases in quality by 1 each day //! Done
2) Sulfuras the quality and sellIn values never change and are always 80 and 0 respectively //! Done
3) Backstage passes: //! Done
    - Increases in quality by 1 each day
    - Increases in quality by 2 when there are 10 days or less
    - Increases in quality by 3 when there are 5 days or less
    - Quality drops to 0 (quality <= 0) after the concert

--------------------------------------------

New Feature:

New item added called "Conjured": //! Done
    - Decreases in quality by 2 each day
    - When a product has passed its sell by date (sellIn <= 0), decrease the quality by 4 each day

--------------------------------------------
*/

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    //! Method to updateQuality totally refactored!
    // public void updateQuality() {
    //     for (Item item : items) {
    //         // ItemUpdater itemUpdater = ItemUpdaterFactory.createItemUpdater(item);
    //         // itemUpdater.update(item);
    //     }
    // }

    public void updateQuality(){
        for (Item item : items) {
            Updateable itemUpdateable = ItemFactory.createItem(item);
            itemUpdateable.update();
        }
    }
}