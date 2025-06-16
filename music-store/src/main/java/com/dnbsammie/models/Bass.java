package com.dnbsammie.models;

import java.math.BigDecimal;
import com.dnbsammie.enums.BodyType;
import com.dnbsammie.enums.Brand;
import com.dnbsammie.enums.PickupType;
import com.dnbsammie.enums.WoodType;

public class Bass extends Product {

    private Brand brand;
    private BodyType bodyType;
    private WoodType bodyWood;
    private PickupType pickup;
    private int numberOfStrings;
    private boolean fretless, activePickup, customPaint, rightOrientation;

    public Bass(String name, String model, String description, int quantity, byte discount, BigDecimal price,
            Brand brand, BodyType bodyType, WoodType bodyWood, PickupType pickup, int numberOfStrings, boolean fretless,
            boolean activePickup, boolean customPaint, boolean rightOrientation) {
        super(name, model, description, quantity, discount, price);
        this.brand = brand;
        this.bodyType = bodyType;
        this.bodyWood = bodyWood;
        this.pickup = pickup;
        this.numberOfStrings = numberOfStrings;
        this.fretless = fretless;
        this.activePickup = activePickup;
        this.customPaint = customPaint;
        this.rightOrientation = rightOrientation;
    }

    public Brand getBrand() { return brand; }

    public void setBrand(Brand brand) { this.brand = brand; }

    public BodyType getBodyType() { return bodyType; }

    public void setBodyType(BodyType bodyType) { this.bodyType = bodyType; }

    public WoodType getBodyWood() { return bodyWood; }

    public void setBodyWood(WoodType bodyWood) { this.bodyWood = bodyWood; }

    public PickupType getPickup() { return pickup; }

    public void setPickup(PickupType pickup) { this.pickup = pickup; }

    public int getNumberOfStrings() { return numberOfStrings; }

    public void setNumberOfStrings(int numberOfStrings) { this.numberOfStrings = numberOfStrings; }

    public boolean isFretless() { return fretless; }

    public void setFretless(boolean fretless) { this.fretless = fretless; }

    public boolean isActivePickup() { return activePickup; }

    public void setActivePickup(boolean activePickup) { this.activePickup = activePickup; }

    public boolean isCustomPaint() { return customPaint; }

    public void setCustomPaint(boolean customPaint) { this.customPaint = customPaint; }

    public boolean isRightOrientation() { return rightOrientation; }

    public void setRightOrientation(boolean rightOrientation) { this.rightOrientation = rightOrientation; }

    @Override
    public String toString() {
        return "Bass [brand=" + brand + ", bodyType=" + bodyType + ", bodyWood=" + bodyWood + ", pickup=" + pickup
                + ", numberOfStrings=" + numberOfStrings + ", fretless=" + fretless + ", activePickup=" + activePickup
                + ", customPaint=" + customPaint + ", rightOrientation=" + rightOrientation + "]";
    }
}
