package com.frameium.utilities.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtilities {
    public static String DatePick() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now); //---->> 29/03/2022
        String Date=date;
        return Date;
    }
    public String DatepickTomorrowDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        //System.out.println(date);
        String[] arr = date.split("/");
        String dateToday = arr[0];// ----->>29
        //System.out.println(arr[0]);
        String currentmonth=arr[1];
        String year=arr[2];
        System.out.println(currentmonth);
        int month=Integer.parseInt(currentmonth);

        System.out.println(month);
        int Year=Integer.parseInt(year);
        String Date="0";
        int day=Integer.parseInt(dateToday);
        int day2=0;
        if (currentmonth.contains("01")||currentmonth.contains("03")||currentmonth.contains("05")||currentmonth.contains("07")||currentmonth.contains("08")||currentmonth.contains("10")||currentmonth.contains("12"))

        {
            if(day==31) {
                day2=01;
                month=month+1;
                if(month==13) {
                    month=01;
                    Year=Year+1;
                }
                arr[2]=String.valueOf(Year);
                arr[1]=String.format("%02d",month);
                // System.out.println( arr[1]);

            }
            else {
                day2=day+1;
            }}
        if(currentmonth.contains("04")||currentmonth.contains("06")||currentmonth.contains("09")||currentmonth.contains("11"))
            if(day==30){
                day2=01;
                month=month+1;
            }
            else {
                day2=day+1;
            }
        arr[1]=String.format("%02d",month);
        if(currentmonth.contains("02")){
            if(day==28){
                day2=01;
                month=month+1;
            }
            else {
                day2=day+1;
            }
            arr[1]=String.format("%02d",month);
            System.out.println(arr[1]);
            //arr[1]=String.valueOf(month);
            System.out.println(day2);
            String daytwo=String.format("%02d",day2);
            String monthAndYear = arr[1]+"/"+arr[2];
            String tomorrow = daytwo;
            Date = tomorrow+"/"+monthAndYear;
            //System.out.println(Date);
        }
        String daytwo=String.format("%02d",day2);
        String monthAndYear = arr[1]+"/"+arr[2];
        String tomorrow = daytwo;
        Date = tomorrow+"/"+monthAndYear;
        System.out.println(Date);
        return Date;
    }

    public String DatepickNarrativeFormat(String date1) {

        String date=date1;
        String[] arr = date.split("/");
        String dateToday = arr[1];// ----->>29

        int day=Integer.parseInt(dateToday);
        String a= String.format("%02d",day);
        System.out.println("a"+a);
        String monthAndYear = arr[2]+a;
        System.out.println("arr[2]"+arr[2]);
        System.out.println("monthAndYear"+monthAndYear);
        String s2 = monthAndYear.replace(" ", "");
        String DAYY=arr[0];
        int dayy=Integer.parseInt(DAYY);
        String b=String.format("%02d",dayy);
        // String Date = s2+arr[0];
        String Date = s2+b;
        System.out.println(Date);
        return Date;
    }

}



