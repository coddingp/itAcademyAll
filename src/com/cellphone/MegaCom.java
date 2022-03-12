package com.cellphone;

public class MegaCom {
    private int myNumber;
    private String sms;
    private String internet;
    private int otherNumber;
    private double smsRating = 1.7;
    private double InternetGbRating = 40;
    private double otherCallRating = 1.05;
    private double insideMegaCallRating = 0;


    public MegaCom(int myNumber, String sms,
                   String internet, int otherNumber) {
        this.myNumber = 555565456;
        this.sms = sms;
        this.internet = internet;
        this.otherNumber = otherNumber;
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

    @Override
    public String toString() {
        return "MegaCom{" +
                "myNumber=" + myNumber +
                ", sms='" + sms + '\'' +
                ", internet='" + internet + '\'' +
                ", otherNumber=" + otherNumber +
                ", rating=" +
                '}';
    }
}
