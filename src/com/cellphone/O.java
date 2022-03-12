package com.cellphone;

public class O {
    private int myNumber;
    private String sms;
    private String internet;
    private int otherNumber;
    private double rating;
    private double smsRating = 2;
    private double InternetGbRating = 30;
    private double otherCallRating = 0.95;
    private double insideMegaCallRating = 0;


    public O(int myNumber, String sms, String internet, int otherNumber, double rating, double smsRating, double internetGbRating, double otherCallRating, double insideMegaCallRating) {
        this.myNumber = myNumber;
        this.sms = sms;
        this.internet = internet;
        this.otherNumber = otherNumber;
        this.rating = rating;
        this.smsRating = smsRating;
        InternetGbRating = internetGbRating;
        this.otherCallRating = otherCallRating;
        this.insideMegaCallRating = insideMegaCallRating;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public int getOtherNumber() {
        return otherNumber;
    }

    public void setOtherNumber(int otherNumber) {
        this.otherNumber = otherNumber;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getSmsRating() {
        return smsRating;
    }

    public void setSmsRating(double smsRating) {
        this.smsRating = smsRating;
    }

    public double getInternetGbRating() {
        return InternetGbRating;
    }

    public void setInternetGbRating(double internetGbRating) {
        InternetGbRating = internetGbRating;
    }

    public double getOtherCallRating() {
        return otherCallRating;
    }

    public void setOtherCallRating(double otherCallRating) {
        this.otherCallRating = otherCallRating;
    }

    public double getInsideMegaCallRating() {
        return insideMegaCallRating;
    }

    public void setInsideMegaCallRating(double insideMegaCallRating) {
        this.insideMegaCallRating = insideMegaCallRating;
    }

    @Override
    public String toString() {
        return "O{" +
                "myNumber=" + myNumber +
                ", sms='" + sms + '\'' +
                ", internet='" + internet + '\'' +
                ", otherNumber=" + otherNumber +
                ", rating=" + rating +
                ", smsRating=" + smsRating +
                ", InternetGbRating=" + InternetGbRating +
                ", otherCallRating=" + otherCallRating +
                ", insideMegaCallRating=" + insideMegaCallRating +
                '}';
    }
}
