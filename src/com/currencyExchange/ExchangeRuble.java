package com.currencyExchange;

public class ExchangeRuble {
    float ruble;
    float dollar;
    float som;
    String firstCurrency;
    String secondCurrency;
    float amount;

    public ExchangeRuble(String firstCurrency, String secondCurrency, float amount) {
        this.ruble = 1.15f;
        this.dollar = 84.5f;
        this.som = 2;
        this.firstCurrency=firstCurrency;
        this.secondCurrency = secondCurrency;
        this.amount = amount;
        amountToRecieve();
    }

    public void setFirstCurrency(String firstCurrency) {
        this.firstCurrency = firstCurrency;
    }

    public void setSecondCurrency(String secondCurrency) {
        this.secondCurrency = secondCurrency;
    }

    public String getFirstCurrency() {
        return firstCurrency;
    }

    public String getSecondCurrency() {
        return secondCurrency;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setSom(float som) {
        this.som = som;
    }

    public void setDollar(float dollar) {
        this.dollar = dollar;
    }

    public void setRuble(float ruble) {
        this.ruble = ruble;
    }

    public float getSom() {
        return som;
    }

    public float getRuble() {
        return ruble;
    }

    public float getDollar() {
        return dollar;
    }

    public float amountToRecieve() {
        switch (secondCurrency) {
            case "рубли":
                return this.ruble*getAmount();
            case "доллары":
                return this.dollar*getDollar();
            case "сомы":
                return this.som*getSom();
        }
        return 0;
    }
}
