package cn.zzf.impl;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:14:37
 **/

public class ChangeCommissionedTransaction extends ChangeClassificationTransaction {

    private Double monthlySalary;

    private Double commissionRate;

    public ChangeCommissionedTransaction(Integer empId, Double monthlySalary, Double commissionRate) {
        super(empId);
        this.monthlySalary = monthlySalary;
        this.commissionRate = commissionRate;
    }

    @Override
    public PaymentClassification getPaymentClassification() {
        return new CommissionedClassification(monthlySalary,commissionRate);
    }

    @Override
    public PaymentSchedule getPaymentSchedule() {
        return new BiWeeklySchedule();
    }
}
