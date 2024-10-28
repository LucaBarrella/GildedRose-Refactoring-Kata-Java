package com.gildedrose;

public abstract class AbstractItem implements Updateable {
    protected final Item item;
    // protected final QualityValidator qualityValidator; //? Should be private?
    // protected final SellInHandler sellInHandler; //? Should be private?

    protected AbstractItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        this.item = item;
        // this.sellInHandler = new SellInHandler();
        // this.qualityValidator = new QualityValidator();
    }

    @Override
    public final void update() {
        sellInHandler.decrementSellIn(item);
        if (qualityValidator.checkQuality(item)) {
            updateQuality();
        }
        if (sellInHandler.isExpired(item) && qualityValidator.checkQuality(item)) {
            updateQualityAfterSellIn();
        }
    }

    protected abstract void updateQuality();

    protected abstract void updateQualityAfterSellIn();

    
}