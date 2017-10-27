package com.epam.parser;

import com.epam.model.TableModel;
import com.opencsv.CSVReader;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    private static final String PATH_TIME_FILE = "src/main/resources/time.csv";
    private static final Logger LOG = Logger.getLogger(CSVParser.class);

    public static List<TableModel> parseCSV() throws IOException {
        CSVReader reader;
        reader = new CSVReader(new FileReader(PATH_TIME_FILE), ',');
        List<TableModel> data = new ArrayList<>();
        String[] nextLine;
        reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            data.add(new TableModel(nextLine[0].substring(0, 10), Integer.valueOf(nextLine[1]), Integer.valueOf(nextLine[2]),
                nextLine[3], Integer.valueOf(nextLine[4]), Integer.valueOf(nextLine[5]),
                Integer.valueOf(nextLine[6]), Integer.valueOf(nextLine[7]), Integer.valueOf(nextLine[8]),
                Integer.valueOf(nextLine[9])));
        }
        LOG.info("Parsed CSV to List<TableModel>");
        return data;
    }
}









