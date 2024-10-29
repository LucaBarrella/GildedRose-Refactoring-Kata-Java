package com.gildedrose;

public abstract class AbstractItemUpdateStrategy implements ItemUpdateStrategy {

    private static final int MIN_QUALITY = 0;
    private static final int MAX_QUALITY = 50;
    private static final int DEFAULT_QUALITY_CHANGE = 1;

    @Override
    public void update(Item item) {
        decreaseDaysToSell(item);
        updateQuality(item);
        if (isExpired(item)) {
            updateQualityAfterSellIn(item);
        }
    }

    protected void decreaseDaysToSell(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    protected boolean isExpired(Item item) {
        return item.sellIn < 0;
    }

    protected void incrementQuality(Item item) {
        incrementQuality(item, DEFAULT_QUALITY_CHANGE);
    }

    protected void incrementQuality(Item item, int amount) {
        if ((item.quality + amount) <= MAX_QUALITY) {
            item.quality = item.quality + amount;
        } else {
            item.quality = MAX_QUALITY;
        }
    }

    protected void decrementQuality(Item item) {
        decrementQuality(item, DEFAULT_QUALITY_CHANGE);
    }

    protected void decrementQuality(Item item, int amount) {
        if ((item.quality - amount) >= MIN_QUALITY) {
            item.quality = item.quality - amount;
        } else {
            item.quality = MIN_QUALITY;
        }
    }

    protected abstract void updateQuality(Item item);

    protected abstract void updateQualityAfterSellIn(Item item);

}