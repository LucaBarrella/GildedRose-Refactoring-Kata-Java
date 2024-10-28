package com.gildedrose;

public class QualityValidator {
    private final int MIN_QUALITY = 0;
    private final int MAX_QUALITY = 50;

    public boolean checkQuality(Item item) {
        return item.quality > MIN_QUALITY && item.quality < MAX_QUALITY;
    }
}
