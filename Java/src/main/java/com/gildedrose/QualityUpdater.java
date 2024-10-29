package com.gildedrose;

public class QualityUpdater {
    private static final int MIN_QUALITY = 0;
    private static final int MAX_QUALITY = 50;
    private static final int DEFAULT_QUALITY_CHANGE = 1;
    private final Item item;

    public QualityUpdater(Item item) {
        this.item = item;
    }

    public void incrementQuality() {
        incrementQuality(DEFAULT_QUALITY_CHANGE);
    }

    public void incrementQuality(int amount) {
        if ((item.quality + amount) <= MAX_QUALITY) {
            item.quality += amount;
        } else {
            item.quality = MAX_QUALITY;
        }
    }

    public void decrementQuality() {
        decrementQuality(DEFAULT_QUALITY_CHANGE);
    }

    public void decrementQuality(int amount) {
        if ((item.quality - amount) >= MIN_QUALITY) {
            item.quality -= amount;
        } else {
            item.quality = MIN_QUALITY;
        }
    }
}