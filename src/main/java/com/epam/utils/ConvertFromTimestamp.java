package com.epam.utils;


import com.epam.model.TableModel;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ConvertFromTimestamp {
    public static String convert(int sec) {
        LocalDateTime dateTime = LocalDateTime.ofEpochSecond(sec, 0, ZoneOffset.UTC);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return dateTime.format(formatter);
    }

    public static ArrayList<TableModel> toRightTime(ArrayList<TableModel>list ){

            for(int i = 0; i < list.size(); i++){
                list.get(i).setFirstColumn(ConvertFromTimestamp.convert(i + 1));
            }
            return list;
    }
}
