package cn.zzf.impl;

import java.util.Objects;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 11:55:10
 **/

public class TimeCardTransaction implements Transaction {
    private Integer empId;
    private TimeCard timeCard;
    private EmpDB db = EmpDB.getDB();

    public TimeCardTransaction() {

    }

    public TimeCardTransaction(Integer empId, TimeCard timeCard) {
        this.empId = empId;
        this.timeCard = timeCard;
    }

    @Override
    public void execute() {
        Employee employee = db.getEmployee(empId);
        PaymentClassification paymentClassification = employee.getPaymentClassification();

        if (!Objects.equals(paymentClassification.getClass(),HourlyClassification.class)) {
            throw new RuntimeException("关联失败，雇员不是钟点工");
        }
        HourlyClassification classification = (HourlyClassification) employee.getPaymentClassification();
        classification.getTimeCards().add(timeCard);
    }
}
