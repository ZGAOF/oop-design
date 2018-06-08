package cn.zzf.impl;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 10:37:40
 **/

public class SalesReceipt {

    private Date date;
    private Integer amount;

    public SalesReceipt(Date date, Integer amount) {
        this.date = date;
        this.amount = amount;
    }

    public SalesReceipt() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
