package cn.zzf.impl;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 11:16:15
 **/

public class ServiceCharge {

    private Date date;
    private Double amount;

    public ServiceCharge() {
    }

    public ServiceCharge(Date date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
