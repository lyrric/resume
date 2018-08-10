package com.web.freemarker.demo.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {


    public static int getYear(){
        return LocalDate.now().getYear();
    }
    public static int getMonth(){
        return LocalDate.now().getMonthValue();
    }
    public static int getDay(){
        return LocalDate.now().getDayOfMonth();
    }

}
