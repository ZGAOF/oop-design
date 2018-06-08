package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:07:52
 **/

public class ChangeMonthlyTransaction extends ChangeClassificationTransaction {

    private Double monthSalary;

    public ChangeMonthlyTransaction(Integer empId, Double monthSalary) {
        super(empId);
        this.monthSalary = monthSalary;
    }

    @Override
    public PaymentClassification getPaymentClassification() {
        return new MonthlyClassification(monthSalary);
    }

    @Override
    public PaymentSchedule getPaymentSchedule() {
        return new MonthlySchedule();
    }
}
