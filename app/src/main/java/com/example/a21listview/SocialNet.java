package com.example.a21listview;

public class SocialNet {
    private int img;
    private String title;
    private String subTitle;

    public SocialNet() {
    }

    public SocialNet(int img, String title, String subTitle) {
        this.img = img;
        this.title = title;
        this.subTitle = subTitle;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Override
    public String toString() {
        return "SocialNet{" +
                "img=" + img +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                '}';
    }
}
