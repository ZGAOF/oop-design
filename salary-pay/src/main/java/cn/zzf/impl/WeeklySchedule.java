package cn.zzf.impl;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 16:11:52
 **/

public class WeeklySchedule extends PaymentSchedule {
    @Override
    public boolean isPayDay(Date date) {
        return DateUtil.getWeekday(date) == 5;
    }

    @Override
    public Date getStartPayDate(Date payDate) {
        return DateUtil.getPayStartDate(payDate,-6);
    }
}
