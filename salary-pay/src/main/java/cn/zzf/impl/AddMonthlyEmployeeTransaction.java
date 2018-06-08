package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 15:55:18
 **/

public class AddMonthlyEmployeeTransaction extends AddEmployeeTransaction{

    private double monthlySalary;

    public AddMonthlyEmployeeTransaction(String name, String address, Integer empId, double monthlySalary) {
        super(name, address, empId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public PaymentClassification getPaymentClassification() {
        return new MonthlyClassification(monthlySalary);
    }

    @Override
    public PaymentSchedule getPaymentSchedule() {
        return new MonthlySchedule();
    }
}
