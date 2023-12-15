package com.example.airbnbapplication.search;

import java.io.Serializable;

public class SearchDTO implements Serializable {

    private int guestroomImg, guestroomPrice;
    private String hostName,guestroomName;

    public SearchDTO(int guestroomImg, int guestroomPrice, String hostName, String guestroomName) {
        this.guestroomImg = guestroomImg;
        this.guestroomPrice = guestroomPrice;
        this.hostName = hostName;
        this.guestroomName = guestroomName;
    }

    public int getGuestroomImg() {
        return guestroomImg;
    }

    public void setGuestroomImg(int guestroomImg) {
        this.guestroomImg = guestroomImg;
    }

    public int getGuestroomPrice() {
        return guestroomPrice;
    }

    public void setGuestroomPrice(int guestroomPrice) {
        this.guestroomPrice = guestroomPrice;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getGuestroomName() {
        return guestroomName;
    }

    public void setGuestroomName(String guestroomName) {
        this.guestroomName = guestroomName;
    }
}
