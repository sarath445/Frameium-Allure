package com.frameium.pageobject.UFS;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateUtilities {
    public static String FutureDay;
    public static String FutureMonth;
    public static String currentmonth;
    public static String recurringmonth;
    public static String FutureDayRecurring;
    public static String monthafter5days;
    public static String monthafterdays;
    public static String date5;
    public static String date2;
    public static String dateend;
    public static String Monthrecurringend;


    public String DatepickRecurringLastdateMonthDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        //	String date="30/12/2022";
        String[] arr = date.split("/");
        String dateToday = arr[0];// ----->>29
        currentmonth = arr[1];
        String year = arr[2];
        // System.out.println(currentmonth);
        int month = Integer.parseInt(currentmonth);
        //  System.out.println(month);
        int Year = Integer.parseInt(year);
        String Date = "0";
        int day = Integer.parseInt(dateToday);
        int day2 = 0;
        if (currentmonth.contains("01") || currentmonth.contains("03") || currentmonth.contains("05") || currentmonth.contains("07") || currentmonth.contains("08") || currentmonth.contains("10") || currentmonth.contains("12")) {
            if (day == 31) {
                day2 = 02;
                month = month + 1;
                if (month == 13) {
                    month = 01;
                    Year = Year + 1;
                }
                arr[2] = String.valueOf(Year);
                arr[1] = String.format("%02d", month);

            } else {
                day2 = day + 2;
            }
        }
        if (currentmonth.contains("01") || currentmonth.contains("03") || currentmonth.contains("05") || currentmonth.contains("07") || currentmonth.contains("08") || currentmonth.contains("10") || currentmonth.contains("12")) {
            if (day == 30) {
                day2 = 01;
                month = month + 1;
                if (month == 13) {
                    month = 01;
                    Year = Year + 1;
                }
                arr[2] = String.valueOf(Year);
                arr[1] = String.format("%02d", month);
                // System.out.println( arr[1]);

            }

        }
        if (currentmonth.contains("04") || currentmonth.contains("06") || currentmonth.contains("09") || currentmonth.contains("11")) {
            if (day == 30) {

                day2 = 02;
                month = month + 1;
            } else {
                day2 = day + 2;
            }
            arr[1] = String.format("%02d", month);
        }
        if (currentmonth.contains("04") || currentmonth.contains("06") || currentmonth.contains("09") || currentmonth.contains("11")) {
            if (day == 29) {

                day2 = 01;
                month = month + 1;
            }

            arr[1] = String.format("%02d", month);
        }
        if (currentmonth.contains("02")) {
            if (day == 28) {
                day2 = 02;
                month = month + 1;
            } else {
                day2 = day + 2;
            }
        }
        if (currentmonth.contains("02")) {
            if (day == 27) {
                day2 = 01;
                month = month + 1;
            }
        }


        arr[1] = String.format("%02d", month);
        String futuremonth = "new";


        String updatedmonth = String.format("%02d", month);
        if (updatedmonth.contains("01")) {
            futuremonth = "Jan";

        }
        if (updatedmonth.contains("02")) {
            futuremonth = "Feb";

        }


        if (updatedmonth.contains("03")) {
            futuremonth = "Mar";

        }
        if (updatedmonth.contains("04")) {
            futuremonth = "Apr";

        }

        if (updatedmonth.contains("05")) {
            futuremonth = "May";

        }
        if (updatedmonth.contains("06")) {
            futuremonth = "Jun";

        }
        if (updatedmonth.contains("07")) {
            futuremonth = "Jul";

        }
        if (updatedmonth.contains("08")) {
            futuremonth = "Aug";

        }
        if (updatedmonth.contains("09")) {
            futuremonth = "Sep";

        }
        if (updatedmonth.contains("10")) {
            futuremonth = "Oct";

        }

        if (updatedmonth.contains("11")) {
            futuremonth = "Nov";

        }

        if (updatedmonth.contains("12")) {
            futuremonth = "Dec";

        }


        String daytwo = String.format("%02d", day2);
        String monthAndYear = arr[1] + "/" + arr[2];
        String tomorrow = daytwo;
        FutureDay = tomorrow;
        Date = tomorrow + "/" + monthAndYear;
        FutureMonth = futuremonth;
        return FutureDay;
    }

    public String dateafter2days() {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dtf.format(futureDate);
return date;
    }


    public String dateafter6days() {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(6);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current date: " + currentDate.format(formatter));
        System.out.println("Date after 6 days: " + futureDate.format(formatter));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dtf.format(futureDate);
        String[] arr = date.split("/");
        date5 = arr[0];// ----->>29
        monthafter5days = arr[1];
        String year = arr[2];
        String a = "";
        return date5;

    }
    public String dateafter5dayss() {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current date: " + currentDate.format(formatter));
        System.out.println("Date after 5 days: " + futureDate.format(formatter));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dtf.format(futureDate);
        String[] arr = date.split("/");
        date = arr[0];// ----->>29
        monthafterdays = arr[1];
        String year = arr[2];
        String a = "";
        return date;

    }


    public String DatepickCobChangeMonthDate2days() {
    LocalDate currentDate = LocalDate.now();
    LocalDate futureDate = currentDate.plusDays(2);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    System.out.println("Current date: "+currentDate.format(formatter));
    System.out.println("Date after 2 days: "+futureDate.format(formatter));
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String date = dtf.format(futureDate);
    String[] arr = date.split("/");
    date2 =arr[0];// ----->>29

         monthafterdays =arr[1];
    String year = arr[2];
    String a = "";
        LocalDate futureDate2 = currentDate.plusDays(10);
        String dateenddate = dtf.format(futureDate2);
        String[] arrr = dateenddate.split("/");
        dateend=arrr[0];
        Monthrecurringend=arr[1];


    return date2;
}


    public String DatepickCobChangeMonthDate5days() {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current date: "+currentDate.format(formatter));
        System.out.println("Date after 2 days: "+futureDate.format(formatter));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dtf.format(futureDate);
        String[] arr = date.split("/");
        date2 =arr[0];// ----->>29

        monthafterdays =arr[1];
        String year = arr[2];
        String a = "";
        LocalDate futureDate2 = currentDate.plusDays(10);
        String dateenddate = dtf.format(futureDate2);
        String[] arrr = dateenddate.split("/");
        dateend=arrr[0];
        Monthrecurringend=arr[1];


        return date2;
    }








    public String DatepickRecurringDateromorrow() {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current date: "+currentDate.format(formatter));
        System.out.println("Date after 2 days: "+futureDate.format(formatter));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dtf.format(futureDate);
        String[] arr = date.split("/");
        date2 =arr[0];// ----->>29
        monthafterdays =arr[1];
        String year = arr[2];
        String a = "";
        return date2;
    }

    public String Datepicktoday() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dtf.format(currentDate);
        String[] arr = date.split("/");
        String day =arr[0];// ----->>29
        String month =arr[1];
        String year = arr[2];
        String a = "";
        return date;
    }


    public  String DatepickTomorrowMonthDay() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        //System.out.println(date);
        String[] arr = date.split("/");
        String dateToday = arr[0];// ----->>29
        //System.out.println(arr[0]);
        currentmonth=arr[1];
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
        String futuremonth="new";
        String updatedmonth=String.format("%02d",month);
        if(updatedmonth.contains("01"))

        {
            futuremonth="Jan";

        }
        if(updatedmonth.contains("02"))

        {
            futuremonth="Feb";

        }

        if(updatedmonth.contains("03"))

        {
            futuremonth="Mar";

        }
        if(updatedmonth.contains("04"))

        {
            futuremonth="Apr";

        }
        if(updatedmonth.contains("05"))

        {
            futuremonth="May";

        }
        if(updatedmonth.contains("06"))

        {
            futuremonth="Jun";

        }
        if(updatedmonth.contains("07"))

        {
            futuremonth="Jul";

        }
        if(updatedmonth.contains("08"))

        {
            futuremonth="Aug";

        }
        if(updatedmonth.contains("09"))

        {
            futuremonth="Sep";

        }
        if(updatedmonth.contains("10"))

        {
            futuremonth="Oct";

        }

        if(updatedmonth.contains("11"))

        {
            futuremonth="Nov";

        }
        if(updatedmonth.contains("12"))
        {
            futuremonth="Dec";
        }
        String daytwo=String.format("%02d",day2);
        String monthAndYear = arr[1]+"/"+arr[2];
        String tomorrow = daytwo;
        FutureDay=tomorrow;
        FutureMonth=futuremonth;
        Date = tomorrow+"/"+monthAndYear;
        System.out.println(Date);
        return FutureDay;
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
        String Date = s2+b;
        System.out.println(Date);
        return Date;
    }

}
