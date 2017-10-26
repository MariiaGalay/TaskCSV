package com.epam.parser;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void sort(List<TableModel> data) throws IOException {
        data.stream().collect(Collectors.groupingBy((p) -> p.getFirstColumn()));
    }

}
