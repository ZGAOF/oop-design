package cn.zzf.impl;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 15:48:34
 **/

public class HourlyClassification extends PaymentClassification {

    private double hourlyRate;
    private LinkedList<TimeCard> timeCards = new LinkedList<>();

    public HourlyClassification() {
    }

    public HourlyClassification(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public LinkedList<TimeCard> getTimeCards() {
        return timeCards;
    }

    public void setTimeCards(LinkedList<TimeCard> timeCards) {
        this.timeCards = timeCards;
    }

    @Override
    public Double calculatePay(PayCheck payCheck) {
        Double sum = 0.0;
        for (TimeCard timeCard : timeCards) {
            if (DateUtil.isBetweenDate(timeCard.getDate(),payCheck.getPayStartTime(),payCheck.getPayDate())) {
                int hours = timeCard.getHours();
                if (hours > 8) {
                    sum += hourlyRate * 8;
                    sum += hourlyRate * (hours - 8) *1.5;
                    continue;
                }
                sum += hourlyRate * hours;
                System.out.println(sum);
            }
        }
        return sum;
    }
}
