package cn.zzf.impl;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 22:50:37
 **/

public class DateUtil {
    public static int getDateDiff(Date aDate,Date bDate) {
        int oneDay = 24*60*60;
        return (int) ((aDate.getTime() - bDate.getTime()) / oneDay);
    }
    public static Date getFirstDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH,0);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        return calendar.getTime();
    }

    public static int getFridayCount(Date aDate,Date bDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(aDate);
        int count = 0;
        while (calendar.getTime().getTime() <= bDate.getTime()) {
            if (getWeekday(calendar.getTime()) == 5) {
                count++;
            }
            calendar.add(Calendar.DATE,1);
        }
        return count;
    }

    public static int getWeekday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (i == 0) {
            i = 7;
        }
        return i;
    }

    public static boolean isLastMonthDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        return calendar.get(Calendar.DAY_OF_MONTH) == lastDay;
    }

    public static boolean isSecondWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.WEEK_OF_MONTH) % 2 == 0;
    }

    public static boolean isBetweenDate(Date sDate,Date aDate,Date bDate) {
        long sTime = sDate.getTime();
        long aTime = aDate.getTime();
        long bTime = bDate.getTime();
        return sTime >= aTime && sTime <= bTime;
    }

    public static Date getPayStartDate(Date afterDate, int step) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(afterDate);
        calendar.add(Calendar.DATE,step);
        return calendar.getTime();
    }

    public static Date getDate(int year,int month,int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month - 1,day);
        return calendar.getTime();
    }
}
