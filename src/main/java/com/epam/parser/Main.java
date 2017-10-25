package com.epam.parser;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<TableModel> data = CSVParser.parseCSV();
        Sort.sort(data);
        CSVParser.writeListCSV(data);

        HashMap<String, Integer> sumMap = SumOfColumn.sum(data);
        CSVParser.writeMaptoCsv(sumMap);
        CSVParser.writeListCSV(data);

    }
}
