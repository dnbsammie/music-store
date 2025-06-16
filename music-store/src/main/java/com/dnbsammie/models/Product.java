package com.dnbsammie.models;

import java.math.BigDecimal;

public abstract class Product {

    protected String name, model, description;
    protected int quantity;
    protected byte discount;
    protected BigDecimal price;

    public Product(String name, String model, String description, int quantity, byte discount, BigDecimal price) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.quantity = quantity;
        this.discount = discount;
        this.price = price;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public byte getDiscount() { return discount; }

    public void setDiscount(byte discount) { this.discount = discount; }

    public BigDecimal getPrice() { return price; }

    public void setPrice(BigDecimal price) { this.price = price; }

    public BigDecimal getFinalPrice() {
        BigDecimal discountMultiplier = BigDecimal.valueOf(1)
                .subtract(BigDecimal.valueOf(discount).divide(BigDecimal.valueOf(100)));
        return price.multiply(discountMultiplier);
    }

    public void restock(int quantity) { this.quantity += quantity; }

    public boolean sell(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            return true;
        }
        return false;
    }
}
