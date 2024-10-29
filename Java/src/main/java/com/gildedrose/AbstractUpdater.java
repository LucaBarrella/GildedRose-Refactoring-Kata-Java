package com.gildedrose;


public abstract class AbstractUpdater {

    protected Item item;
    
    private static final int MIN_QUALITY = 0;
    private static final int MAX_QUALITY = 50;
    private static final int DEFAULT_QUALITY_CHANGE = 1;

    public AbstractUpdater(Item item) {
        this.item = item;
    }
    
    public void update() {
        decreaseDaysToSell();
        updateQuality();
        if (isExpired()) {
            updateQualityAfterSellIn();
        }
    }

    protected void decreaseDaysToSell() {
        item.sellIn--;
    }

    protected boolean isExpired() {
        return item.sellIn < 0;
    }

    protected void incrementQuality() {
        incrementQuality(DEFAULT_QUALITY_CHANGE);
    }

    protected void incrementQuality(int amount) {
        if ((item.quality + amount) <= MAX_QUALITY) {
            item.quality = item.quality + amount;
        } else {
            item.quality = MAX_QUALITY;
        }
    }

    protected void decrementQuality() {
        decrementQuality(DEFAULT_QUALITY_CHANGE);
    }

    protected void decrementQuality(int amount) {
        if ((item.quality - amount) >= MIN_QUALITY) {
            item.quality = item.quality - amount;
        } else {
            item.quality = MIN_QUALITY;
        }
    }

    protected abstract void updateQuality();

    protected abstract void updateQualityAfterSellIn();

}