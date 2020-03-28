package com.sun.billmanager.data.bean;

import java.util.List;

public class BillItem {
    private String clientName;
    private String dealTime;
    private List<ResItem> buyItem;
    private List<ResItem> giftItem;

    public BillItem(String clientName, String dealTime, List<ResItem> buyItem, List<ResItem> giftItem) {
        this.clientName = clientName;
        this.dealTime = dealTime;
        this.buyItem = buyItem;
        this.giftItem = giftItem;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public List<ResItem> getBuyItem() {
        return buyItem;
    }

    public void setBuyItem(List<ResItem> buyItem) {
        this.buyItem = buyItem;
    }

    public List<ResItem> getGiftItem() {
        return giftItem;
    }

    public void setGiftItem(List<ResItem> giftItem) {
        this.giftItem = giftItem;
    }

    public static class ResItem {
        private String name;
        private String unit;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
