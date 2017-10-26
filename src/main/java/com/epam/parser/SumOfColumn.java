package com.epam.parser;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfColumn {
    public static Map<String, Integer> sum(List<TableModel> data) throws IOException {

        Map<String, Integer> result1 = data.stream().collect(
                Collectors.toMap(TableModel::getFirstColumn, TableModel::getSecondColumn,
                        (oldValue, newValue) -> oldValue + newValue));
        return result1;
    }
}

