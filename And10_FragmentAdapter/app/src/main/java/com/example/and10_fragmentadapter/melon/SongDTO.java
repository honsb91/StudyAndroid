package com.example.and10_fragmentadapter.melon;

public class SongDTO {

    private int imgRes , num;
    private String sname , name;

    public SongDTO(int imgRes, int num, String sname, String name) {
        this.imgRes = imgRes;
        this.num = num;
        this.sname = sname;
        this.name = name;
    }


    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
