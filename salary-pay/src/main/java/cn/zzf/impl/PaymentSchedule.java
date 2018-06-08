package cn.zzf.impl;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 16:09:10
 **/

public abstract class PaymentSchedule {
    /**
     * 是否为支付日
     * @author: GaoFeng2017
     * @date: 2018/6/8 16:06
     * @param date
     * @return:
     *
     */
    public abstract boolean isPayDay(Date date);

    /**
     * 获取开始支付日期
     * @author: GaoFeng2017
     * @date: 2018/6/8 16:07
     * @param payDate
     * @return: java.util.Date
     *
     */
    public abstract Date getStartPayDate(Date payDate);

}
