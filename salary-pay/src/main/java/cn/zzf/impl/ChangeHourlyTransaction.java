package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:05:16
 **/

public class ChangeHourlyTransaction extends ChangeClassificationTransaction {

    private Double hourlyRate;

    public ChangeHourlyTransaction(Integer empId, Double hourlyRate) {
        super(empId);
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
