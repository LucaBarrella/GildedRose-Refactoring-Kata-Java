package com.gildedrose;

public abstract class BaseItem implements Updateable {
    protected final Item item;

    protected BaseItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        this.item = item;
    }

    @Override
    public final void update() {
        updateSellIn();
        updateQuality();
        if (isExpired()) {
            updateQualityAfterSellIn();
        }
    }

    @Override
    public void updateSellIn() {
        item.sellIn--;
    }

    @Override
    public abstract void updateQuality();

    protected boolean isExpired() {
        return item.sellIn < 0;
    }

    protected boolean maxQualityNotReached() {
        return item.quality < 50;
    }

    @Override //FIXME This method should be protected, not public!
    public abstract void updateQualityAfterSellIn();

}
