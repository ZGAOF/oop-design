package cn.zzf.impl;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-08 08:59:11
 **/

public class PayCheck {

    /** 实际支付日期 */
    private Date payDate;

    /** 支付开始日期 */
    private Date payStartTime;

    /** 支付总额 */
    private Double grossPay;

    /** 扣除项 */
    private Double deductions;

    /** 实际支付额 */
    private Double netPay;

    /** 支付方式 */
    private String payMethodStr;

    public PayCheck(Date payStartTime,Date payDate) {
        this.payDate = payDate;
        this.payStartTime = payStartTime;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getPayStartTime() {
        return payStartTime;
    }

    public void setPayStartTime(Date payStartTime) {
        this.payStartTime = payStartTime;
    }

    public Double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(Double grossPay) {
        this.grossPay = grossPay;
    }

    public Double getDeductions() {
        return deductions;
    }

    public void setDeductions(Double deductions) {
        this.deductions = deductions;
    }

    public Double getNetPay() {
        return netPay;
    }

    public void setNetPay(Double netPay) {
        this.netPay = netPay;
    }

    public String getPayMethodStr() {
        return payMethodStr;
    }

    public void setPayMethodStr(String payMethodStr) {
        this.payMethodStr = payMethodStr;
    }

    @Override
    public String toString() {
        return "PayCheck{" +
                "payDate=" + payDate +
                ", payStartTime=" + payStartTime +
                ", grossPay=" + grossPay +
                ", deductions=" + deductions +
                ", netPay=" + netPay +
                ", payMethodStr='" + payMethodStr + '\'' +
                '}';
    }
}
