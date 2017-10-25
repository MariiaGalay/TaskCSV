package com.epam.parser;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class SumOfColumn {
    public static HashMap<String, Integer> sum(List<TableModel> data) throws IOException {
        HashMap<String, Integer> mapTime = new HashMap<>();


        for (int i = 0; i < data.size(); i++) {
            if (mapTime.containsKey(data.get(i).getFifthColumn())) {
                mapTime.put(
                        data.get(i).getFifthColumn(),
                        (mapTime.get(data.get(i).getFifthColumn()) + Integer.valueOf(data.get(i).getEighthColumn())));
            } else {
                mapTime.put(data.get(i).getFifthColumn(), Integer.valueOf(data.get(i).getEighthColumn()));
            }
        }
        return mapTime;
    }
}

