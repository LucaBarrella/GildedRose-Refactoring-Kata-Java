package com.gildedrose;

public abstract class UpdatableItem extends Item {
    private final ItemUpdateStrategy itemUpdateStrategy;

    public UpdatableItem(String name, int sellIn, int quality, ItemUpdateStrategy itemUpdateStrategy) {
        super(name, sellIn, quality);
        this.itemUpdateStrategy = itemUpdateStrategy;
    }

    public void update() {
        itemUpdateStrategy.update(this);
    }
}