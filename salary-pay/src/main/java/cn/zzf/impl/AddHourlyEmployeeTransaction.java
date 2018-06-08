package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 15:16:12
 **/

public class AddHourlyEmployeeTransaction extends AddEmployeeTransaction{

    private double hourlyRate;

    public AddHourlyEmployeeTransaction(String name, String address, Integer empId, double hourlyRate) {
        super(name, address, empId);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public PaymentClassification getPaymentClassification() {
        return new HourlyClassification(hourlyRate);
    }

    @Override
    public PaymentSchedule getPaymentSchedule() {
        return new WeeklySchedule();
    }

}
