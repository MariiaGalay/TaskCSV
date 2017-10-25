package com.epam.parser;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    private static final String COMMA_DELIMITER = ",";

    private static final String NEW_LINE_SEPARATOR = "\n";

    //private static final String FILE_HEADER = "id,firstName,lastName,gender,age";


    public static List<TableModel> parseCSV() throws IOException {

        CSVReader reader = null;
        reader = new CSVReader(new FileReader("src/main/resources/time.csv"), ',');
        List<TableModel> data = new ArrayList<>();
        String[] nextLine;
        reader.readNext();
        while ((nextLine = reader.readNext()) != null) {

            data.add(new TableModel(nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], nextLine[6],
                    nextLine[7], nextLine[8], nextLine[9]));
        }
        return data;
    }


    public static void writeToCsv(List<TableModel> data) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/main/resources/sort.csv");
            for (TableModel tableModel : data) {
                fileWriter.append(tableModel.getTime());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(tableModel.getTwo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(tableModel.getThree());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(tableModel.getFour());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(tableModel.getFive());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(tableModel.getSix());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(tableModel.getSeven());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(tableModel.getEight());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(tableModel.getTen());
                fileWriter.append(NEW_LINE_SEPARATOR);

                System.out.println("Ye");
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}
