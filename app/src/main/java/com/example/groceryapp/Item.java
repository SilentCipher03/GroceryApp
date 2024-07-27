package com.example.groceryapp;

public class Item {
    int itemImg;
    String itemName;
    String itemDescription;

    public Item(int img, String itemName, String itemDescription) {
        this.itemImg = img;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public int getImg() {
        return itemImg;
    }

    public void setImg(int img) {
        this.itemImg = img;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
