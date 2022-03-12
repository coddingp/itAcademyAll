package com.itCalculator;

import java.util.Objects;

public class Calculator implements CalculableInterface {
    public Double first;
    public String mathChar;
    public Double second;
    public Double res;

    public Calculator() {

    }

    public Double getFirst() {
        return first;
    }

    public void setFirst(Double first) {
        this.first = first;
    }

    public String getMathChar() {
        return mathChar;
    }

    public void setMathChar(String mathChar) {
        this.mathChar = mathChar;
    }

    public Double getSecond() {
        return second;
    }

    public void setSecond(Double second) {
        this.second = second;
    }

    public Double getRes() {
        return res;
    }

    public void setRes(Double res) {
        this.res = res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return mathChar.equals(that.mathChar) && first.equals(that.first) && second.equals(that.second) && res.equals(that.res);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, mathChar, second, res);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "first=" + first +
                ", mathChar=" + mathChar +
                ", second=" + second +
                ", res=" + res +
                '}';
    }

    @Override
    public Double calculate() {
        switch (this.mathChar) {
            case "+":
                setRes(add());
                break;
            case "-":
                setRes(subtract());
                break;
            case "*":
                setRes(multiply());
                break;
            case "/":
                if (this.second == 0) {
                    throw new ArithmeticException("You can't divide by " + 0);
                } else setRes(divide());
                break;
        }
        return res;
    }

    @Override
    public Double add() {
        return getFirst() + getSecond();
    }

    @Override
    public Double subtract() {
        return getFirst() - getSecond();
    }

    @Override
    public Double multiply() {
        return getFirst() * getSecond();
    }

    @Override
    public Double divide() {
        return getFirst() / getSecond();
    }
}