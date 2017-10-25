package com.epam.parser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<TableModel> data = CSVParser.parseCSV();
        Sort sort = new Sort();
        sort.sort(data);
       CSVParser.writeToCsv(data);
        System.out.println("DONE!");
    }
}
