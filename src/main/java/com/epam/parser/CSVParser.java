package com.epam.parser;

import com.opencsv.CSVReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVParser {
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String PATH_TIME_FILE = "src/main/resources/time.csv";
    private static final String PATH_SORT_FILE = "src/main/resources/sort.csv";
    private static final String PATH_SUM_FILE = "src/main/resources/sum.csv";
    private static final Logger LOG = Logger.getLogger(CSVParser.class);

    public static List<TableModel> parseCSV() throws IOException {
        CSVReader reader;
        reader = new CSVReader(new FileReader(PATH_TIME_FILE), ',');
        List<TableModel> data = new ArrayList<>();
        String[] nextLine;
        reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            data.add(new TableModel(nextLine[0].substring(0, 9), Integer.valueOf(nextLine[1]), nextLine[2], nextLine[3],
                    nextLine[4], nextLine[5], nextLine[6], nextLine[7], nextLine[8], nextLine[9]));
        }
        LOG.info("Parsed CSV to List<TableModel>");
        return data;
    }


    public static void writeListCSV(List<TableModel> data) {
        FileWriter fileWriter = null;
        CSVPrinter csvFilePrinter = null;
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);

        try {
            fileWriter = new FileWriter(PATH_SORT_FILE);
            csvFilePrinter = new CSVPrinter(fileWriter, csvFileFormat);
            for (TableModel tableModel : data) {
                List timeDataRecord = new ArrayList();
                timeDataRecord.add(tableModel.getFirstColumn());
                timeDataRecord.add(tableModel.getSecondColumn());
                timeDataRecord.add(tableModel.getThirdColumn());
                timeDataRecord.add(tableModel.getFourthColumn());
                timeDataRecord.add(tableModel.getFifthColumn());
                timeDataRecord.add(tableModel.getSixthColumn());
                timeDataRecord.add(tableModel.getSeventhColumn());
                timeDataRecord.add(tableModel.getEighthColumn());
                timeDataRecord.add(tableModel.getNinthColumn());
                timeDataRecord.add(tableModel.getTenthColumn());

                csvFilePrinter.printRecord(timeDataRecord);
            }

            LOG.info("CSV file was created successfully !!!");

        } catch (Exception e) {
            LOG.error("Error in CsvFileWriter !!!" + e);
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
                csvFilePrinter.close();
            } catch (IOException e) {
                LOG.error("Error while flushing/closing fileWriter/csvPrinter !!!" + e);
                e.printStackTrace();
            }
        }
    }

    public static void writeMaptoCsv(Map<String, Integer> map) {
        try (Writer writer = new FileWriter(PATH_SUM_FILE)) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.append(entry.getKey())
                        .append(',')
                        .append(entry.getValue().toString())
                        .append(NEW_LINE_SEPARATOR);
            }
            LOG.info("wrote map toCSV succes");
        } catch (IOException e) {
            LOG.info("wrote map toCSV fail" + e);

        }
    }
}




