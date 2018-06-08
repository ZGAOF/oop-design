package cn.zzf.impl;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 16:12:26
 **/

public class MonthlySchedule extends PaymentSchedule {
    @Override
    public boolean isPayDay(Date date) {
        return DateUtil.isLastMonthDay(date);
    }

    @Override
    public Date getStartPayDate(Date payDate) {
        return DateUtil.getFirstDay(payDate);
    }
}
