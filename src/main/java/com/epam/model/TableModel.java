package com.epam.model;

public class TableModel {
    private String firstColumn;
    private Integer secondColumn;
    private Integer thirdColumn;
    private String fourthColumn;
    private Integer fifthColumn;
    private Integer sixthColumn;
    private Integer seventhColumn;
    private Integer eighthColumn;
    private Integer ninthColumn;
    private Integer tenthColumn;

    public String getFirstColumn() {
        return firstColumn;
    }

    public Integer getSecondColumn() {
        return secondColumn;
    }

    public Integer getThirdColumn() {
        return thirdColumn;
    }

    public String getFourthColumn() {
        return fourthColumn;
    }

    public Integer getFifthColumn() {
        return fifthColumn;
    }

    public Integer getSixthColumn() {
        return sixthColumn;
    }

    public Integer getSeventhColumn() {
        return seventhColumn;
    }

    public Integer getEighthColumn() {
        return eighthColumn;
    }

    public Integer getNinthColumn() {
        return ninthColumn;
    }

    public Integer getTenthColumn() {
        return tenthColumn;
    }

    public void setFirstColumn(String firstColumn) {
        this.firstColumn = firstColumn;
    }

    public TableModel(String firstColumn, Integer secondColumn, Integer thirdColumn, String fourthColumn,
                      Integer fifthColumn, Integer sixthColumn, Integer seventhColumn, Integer eighthColumn,
                      Integer ninthColumn, Integer tenthColumn) {
        this.firstColumn = firstColumn;
        this.secondColumn = secondColumn;
        this.thirdColumn = thirdColumn;
        this.fourthColumn = fourthColumn;
        this.fifthColumn = fifthColumn;
        this.sixthColumn = sixthColumn;
        this.seventhColumn = seventhColumn;
        this.eighthColumn = eighthColumn;
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