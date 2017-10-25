package com.epam.parser;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public void sort(List<TableModel> data) throws IOException {
        Collections.sort(data, Comparator.comparing(TableModel::getFive));
         }
}
