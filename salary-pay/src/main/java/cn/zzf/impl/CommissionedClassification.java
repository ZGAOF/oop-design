package cn.zzf.impl;

import java.time.Month;
import java.util.Date;
import java.util.LinkedList;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 15:53:44
 **/

public class CommissionedClassification extends PaymentClassification {

    private Double monthlySalary;
    private Double commissionRate;
    private LinkedList<SalesReceipt> salesReceipts = new LinkedList<>();

    public CommissionedClassification(Double monthlySalary, Double commissionRate) {
        this.monthlySalary = monthlySalary;
        this.commissionRate = commissionRate;
    }

    public CommissionedClassification() {
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public LinkedList<SalesReceipt> getSalesReceipts() {
        return salesReceipts;
    }

    public void setSalesReceipts(LinkedList<SalesReceipt> salesReceipts) {
        this.salesReceipts = salesReceipts;
    }


    @Override
    public Double calculatePay(PayCheck payCheck) {
        Double sum = 0.0;
        for (SalesReceipt sr : salesReceipts) {
            if (DateUtil.isBetweenDate(sr.getDate(),payCheck.getPayStartTime(),payCheck.getPayDate())) {
                sum += commissionRate * sr.getAmount();
            }
        }
        return monthlySalary + sum;
    }
}
