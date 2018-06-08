package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 16:05:17
 **/

public class AddCommissionedTransaction extends AddEmployeeTransaction {

    private double monthSalary;
    private double commissionRate;

    public AddCommissionedTransaction(String name, String address, Integer empId, double monthSalary, double commissionRate) {
        super(name, address, empId);
        this.monthSalary = monthSalary;
        this.commissionRate = commissionRate;
    }

    @Override
    public PaymentClassification getPaymentClassification() {
        return new CommissionedClassification(monthSalary,commissionRate);
    }

    @Override
    public PaymentSchedule getPaymentSchedule() {
        return new BiWeeklySchedule();
    }
}
