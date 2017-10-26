package com.epam.parser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        List<TableModel> table = CSVParser.parseCSV();
        Sort.sort(table);
        CSVParser.writeListCSV(table);

        Map<String, Integer> map = SumOfColumn.sum(table);
        CSVParser.writeMaptoCsv(map);

    }
}
