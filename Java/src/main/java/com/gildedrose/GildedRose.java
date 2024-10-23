package com.gildedrose;

/*
--------------------------------------------
General Rules:

1) Decrease the quality of the item by 1 each day
2) When a product has passed its sell by date (sellIn <= 0), decrease the quality by 2 each day
3) The quality of an item is never negative and never more than 50

--------------------------------------------

Specific Rules:

1) Aged Brie increases in quality by 1 each day
2) Sulfuras the quality and sellIn values never change and are always 80 and 0 respectively
3) Backstage passes:
    - Increases in quality by 1 each day
    - Increases in quality by 2 when there are 10 days or less
    - Increases in quality by 3 when there are 5 days or less
    - Quality drops to 0 (quality <= 0) after the concert

--------------------------------------------

New Feature:

New item added called "Conjured":
    - Decreases in quality by 2 each day
    - When a product has passed its sell by date (sellIn <= 0), decrease the quality by 4 each day

--------------------------------------------
*/

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (
                !items[i].name.equals("Aged Brie") &&
                !items[i].name.equals(
                        "Backstage passes to a TAFKAL80ETC concert"
                    )
            ) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (
                        items[i].name.equals(
                                "Backstage passes to a TAFKAL80ETC concert"
                            )
                    ) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (
                        !items[i].name.equals(
                                "Backstage passes to a TAFKAL80ETC concert"
                            )
                    ) {
                        if (items[i].quality > 0) {
                            if (
                                !items[i].name.equals(
                                        "Sulfuras, Hand of Ragnaros"
                                    )
                            ) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}
