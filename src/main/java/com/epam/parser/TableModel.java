package com.epam.parser;

public class TableModel {
    private String firstColumn;
    private Integer secondColumn;
    private String thirdColumn;
    private String fourthColumn;
    private String fifthColumn;
    private String sixthColumn;
    private String seventhColumn;
    private String eighthColumn;
    private String ninthColumn;
    private String tenthColumn;

    public String getFirstColumn() {
        return firstColumn;
    }

    public Integer getSecondColumn() {
        return secondColumn;
    }

    public String getThirdColumn() {
        return thirdColumn;
    }

    public String getFourthColumn() {
        return fourthColumn;
    }

    public String getFifthColumn() {
        return fifthColumn;
    }

    public String getSixthColumn() {
        return sixthColumn;
    }

    public String getSeventhColumn() {
        return seventhColumn;
    }

    public String getEighthColumn() {
        return eighthColumn;
    }

    public String getNinthColumn() {
        return ninthColumn;
    }

    public String getTenthColumn() {
        return tenthColumn;
    }


    public TableModel(String firstColumn, Integer secondColumn, String thirdColumn, String fourthColumn, String fifthColumn,
                      String sixthColumn, String seven, String eight, String ninthColumn, String tenthColumn) {
        this.firstColumn = firstColumn;
        this.secondColumn = secondColumn;
        this.thirdColumn = thirdColumn;
        this.fourthColumn = fourthColumn;
        this.fifthColumn = fifthColumn;
        this.sixthColumn = sixthColumn;
        this.seventhColumn = seven;
        this.eighthColumn = eight;
        this.ninthColumn = ninthColumn;
        this.tenthColumn = tenthColumn;
    }


    @Override
    public String toString() {
        return
                firstColumn + '\'' +
                secondColumn + '\'' +
                thirdColumn + '\'' +
                fourthColumn + '\'' +
                fifthColumn + '\'' +
                sixthColumn + '\'' +
                seventhColumn + '\'' +
                eighthColumn + '\'' +
                ninthColumn + '\'' +
                tenthColumn + '\'' +
                "\n";
    }
}