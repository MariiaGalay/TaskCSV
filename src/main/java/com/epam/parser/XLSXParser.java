package com.epam.parser;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class XLSXParser {

    final static String FILE_PATH = "src/main/resources/Book1.xlsx";
    final static String FILE_PATH_WRITE = "src/main/resources/sort.xlsx";


    public static void readXLSFileWithBlankCells() throws IOException {
        BufferedReader br;
        try {
            File file = new File(FILE_PATH);
            br = new BufferedReader(new FileReader(file));
            InputStream ExcelFileToRead = new FileInputStream(FILE_PATH);
            XSSFWorkbook wb = new XSSFWorkbook();

            XSSFSheet sheet = wb.getSheetAt(0);
            XSSFRow row;
            XSSFCell cell;

            Iterator rows = sheet.rowIterator();

            while (rows.hasNext()) {
                row = (XSSFRow) rows.next();

                for (int i = 0; i < row.getLastCellNum(); i++) {
                    cell = row.getCell(i, Row.CREATE_NULL_AS_BLANK);
                    System.out.print(cell.toString() + " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void writeXLSXFile(List<TableModel> data) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        int rowCount = 0;


        int rowIndex = 0;
        for (TableModel tableModel : data) {
            Row row = sheet.createRow(rowIndex++);

            int cellIndex = 0;
            row.createCell(cellIndex++).setCellValue(tableModel.getTime());
            row.createCell(cellIndex++).setCellValue(tableModel.getTwo());
            row.createCell(cellIndex++).setCellValue(tableModel.getThree());
            row.createCell(cellIndex++).setCellValue(tableModel.getFour());
            row.createCell(cellIndex++).setCellValue(tableModel.getFive());
            row.createCell(cellIndex++).setCellValue(tableModel.getSix());
            row.createCell(cellIndex++).setCellValue(tableModel.getSeven());
            row.createCell(cellIndex++).setCellValue(tableModel.getEight());
            row.createCell(cellIndex++).setCellValue(tableModel.getNine());
            row.createCell(cellIndex++).setCellValue(tableModel.getTen());
            System.out.println("ojo");


        } try {

            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            workbook.write(fos);
            fos.close();
            System.out.println(FILE_PATH + " is successfully written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


//
//        for (TableModel iter: data) {
//            Row row = sheet.createRow(++rowCount);
//
//            int columnCount = 0;
//
//            for (TableModel field : iter) {
//                Cell cell = row.createCell(++columnCount);
//                if (field instanceof String) {
//                    cell.setCellValue((String) field);
//                } else if (field instanceof Integer) {
//                    cell.setCellValue((Integer) field);
//                }
//            }
////
////        }
////
////        FileOutputStream fileOut = new FileOutputStream(FILE_PATH_WRITE);
////
////        wb.write(fileOut);
////        fileOut.flush();
////        fileOut.close();


