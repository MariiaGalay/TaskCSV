package com.epam.parser;

import com.epam.model.TableModel;
import com.epam.utils.ConvertFromTimestamp;
import com.epam.utils.Sort;
import com.epam.utils.SumOfColumn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<TableModel> tableModelList = CSVParser.parseCSV();
    //   XLSXParser.writeXLSX(Sort.sort(tableModelList), "sort");


        ArrayList<TableModel> list = SumOfColumn.sum(tableModelList);
        ConvertFromTimestamp.toRightTime(list);
       XLSXParser.writeXLSX(list, "sum");



    }
}
