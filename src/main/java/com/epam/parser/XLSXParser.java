package com.epam.parser;

import com.epam.model.TableModel;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XLSXParser {
    private static final String PATH_SRS_FILE = "src/main/resources/";
    private static final Logger LOG = Logger.getLogger(CSVParser.class);

    public static void writeXLSX(List<TableModel> tableModelList, String fileName) throws IOException {

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet(fileName);

        int rowIndex = 0;

        for (TableModel tableModel : tableModelList) {
            Row row = sheet.createRow(rowIndex++);
            int cellIndex = 0;
            row.createCell(cellIndex++).setCellValue(tableModel.getFirstColumn());
            row.createCell(cellIndex++).setCellValue(tableModel.getSecondColumn());
            row.createCell(cellIndex++).setCellValue(tableModel.getThirdColumn());
            row.createCell(cellIndex++).setCellValue(tableModel.getFourthColumn());
            row.createCell(cellIndex++).setCellValue(tableModel.getFifthColumn());
            row.createCell(cellIndex++).setCellValue(tableModel.getSixthColumn());
            row.createCell(cellIndex++).setCellValue(tableModel.getSeventhColumn());
            row.createCell(cellIndex++).setCellValue(tableModel.getEighthColumn());
            row.createCell(cellIndex++).setCellValue(tableModel.getNinthColumn());
            row.createCell(cellIndex++).setCellValue(tableModel.getTenthColumn());
        }

        FileOutputStream fileOut = new FileOutputStream(PATH_SRS_FILE + fileName + ".xlsx");
        LOG.info("Created a file of " + fileName);
        wb.write(fileOut);
        fileOut.flush();
        fileOut.close();
    }
}
