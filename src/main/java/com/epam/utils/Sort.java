package com.epam.utils;

import com.epam.model.TableModel;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static List<TableModel> sort(List<TableModel> data) throws IOException {
        return data.stream().sorted(Comparator.comparing(TableModel::getFirstColumn)).collect(Collectors.toList());

    }
}
