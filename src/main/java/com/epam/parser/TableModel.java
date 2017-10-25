package com.epam.parser;

public class TableModel {
    public String time;
    private String two;
    private String three;
    private String four;
    public String five;
    private String six;
    private String seven;
    private String eight;
    private String nine;
    private String ten;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getSeven() {
        return seven;
    }

    public void setSeven(String seven) {
        this.seven = seven;
    }

    public String getEight() {
        return eight;
    }

    public void setEight(String eight) {
        this.eight = eight;
    }

    public String getNine() {
        return nine;
    }

    public void setNine(String nine) {
        this.nine = nine;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public TableModel(String time, String two, String three, String four, String five, String six, String seven,
                      String eight, String nine, String ten) {
        this.time = time;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.eight = eight;
        this.nine = nine;
        this.ten = ten;
    }


    @Override
    public String toString() {
        return "{"+
                time + '\'' +
                two + '\'' +
                three + '\'' +
                four + '\'' +
                five + '\'' +
                six + '\'' +
                seven + '\'' +
                eight + '\'' +
                nine + '\'' +
                ten + '\'' +
                "}\n";
    }
}
