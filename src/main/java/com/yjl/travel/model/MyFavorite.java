package com.yjl.travel.model;


public class MyFavorite {
    private int rid;
    private String rimage;
    private String rname;
    private double price;
    private String date;

    private int num;//收藏次数

    public MyFavorite() {
    }

    public MyFavorite(int rid, String rimage, String rname, double price, String date) {
        this.rid = rid;
        this.rimage = rimage;
        this.rname = rname;
        this.price = price;
        this.date = date;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRimage() {
        return rimage;
    }

    public void setRimage(String rimage) {
        this.rimage = rimage;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
