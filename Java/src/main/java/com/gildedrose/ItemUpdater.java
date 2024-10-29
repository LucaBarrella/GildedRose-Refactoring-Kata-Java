package com.gildedrose;

public abstract class ItemUpdater {

    protected final Item item;
    protected final QualityUpdater qualityUpdater;
    protected final SellInUpdater sellInUpdater;
    
    public ItemUpdater(Item item) {
        this.item = item;
        this.qualityUpdater = new QualityUpdater(item);
        this.sellInUpdater = new SellInUpdater(item);
    }
    
    public void update() {
        sellInUpdater.decreaseDaysToSell();
        updateQuality();
        if (sellInUpdater.isExpired()) {
            updateQualityAfterSellIn();
        }
    }

    protected void incrementQuality() {
        qualityUpdater.incrementQuality();
    }

    protected void incrementQuality(int amount) {
        qualityUpdater.incrementQuality(amount);
    }

    protected void decrementQuality() {
        qualityUpdater.decrementQuality();
    }

    protected void decrementQuality(int amount) {
        qualityUpdater.decrementQuality(amount);
    }

    protected abstract void updateQuality();

    protected abstract void updateQualityAfterSellIn();
}