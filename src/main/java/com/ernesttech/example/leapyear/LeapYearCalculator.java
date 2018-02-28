package com.ernesttech.example.leapyear;

public class LeapYearCalculator {

    private Year year;

    public LeapYearCalculator() {

    }

    public void setYear(final Year year) {
        this.year = year;
    }

    public String isLeapYear() {

        if (year.isLeapYear()) {
            return "Leap Year";
        }
        return "Not A Leap Year";

    }

}
