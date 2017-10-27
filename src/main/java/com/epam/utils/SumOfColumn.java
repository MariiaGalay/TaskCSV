package com.epam.utils;

import com.epam.model.TableModel;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOfColumn {
    public static ArrayList<TableModel> sum(List<TableModel> data) throws IOException {

        Map<String, TableModel> s =
            data.stream().collect(
                Collectors.toMap(TableModel::getFirstColumn, Function.identity(),
                    (TableModel left, TableModel right) -> new TableModel(
                        left.getFirstColumn(),
                        left.getSecondColumn() + right.getSecondColumn(),
                        left.getThirdColumn() + right.getThirdColumn(),
                        left.getFourthColumn(),
                        left.getFifthColumn() + right.getFifthColumn(),
                        left.getSixthColumn() + right.getSixthColumn(),
                        left.getSeventhColumn() + right.getSeventhColumn(),
                        left.getEighthColumn() + right.getEighthColumn(),
                        left.getNinthColumn() + right.getNinthColumn(),
                        left.getTenthColumn() + right.getTenthColumn()),
                    TreeMap::new));

        return new ArrayList<>(s.values());
    }
}

