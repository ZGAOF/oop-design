package cn.zzf.impl;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 10:37:51
 **/

public class TimeCard {
    private Date date;
    private int hours;

    public TimeCard() {
    }

    public TimeCard(Date date, int hours) {
        this.date = date;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
