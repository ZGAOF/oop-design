package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 15:49:15
 **/

public class MonthlyClassification extends PaymentClassification {
    private Double monthlySalary;

    public MonthlyClassification(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public Double calculatePay(PayCheck payCheck) {
        return monthlySalary;
    }
}
