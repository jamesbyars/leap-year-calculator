package com.ernesttech.example.leapyear;

public class Year {

    private int year;

    public Year(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return year % 400 == 0;
    }

}
