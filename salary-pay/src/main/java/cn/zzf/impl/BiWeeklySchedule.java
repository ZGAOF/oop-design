package cn.zzf.impl;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 16:12:59
 **/

public class BiWeeklySchedule extends PaymentSchedule {

    public BiWeeklySchedule() {
    }

    @Override
    public boolean isPayDay(Date date) {
        int weekday = DateUtil.getWeekday(date);
        return weekday == 5 && DateUtil.isSecondWeek(date);
    }

    @Override
    public Date getStartPayDate(Date payDate) {
        return DateUtil.getPayStartDate(payDate,-13);
    }


}
