package cn.zzf.impl;

import java.util.Objects;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 13:23:19
 **/

public class SalesReceiptTransaction implements Transaction {
    private EmpDB db = EmpDB.getDB();
    private Integer empId;
    private SalesReceipt salesReceipt;

    public SalesReceiptTransaction() {
    }

    public SalesReceiptTransaction(Integer empId, SalesReceipt salesReceipt) {
        this.empId = empId;
        this.salesReceipt = salesReceipt;
    }



    @Override
    public void execute() {
        Employee employee = db.getEmployee(empId);

        PaymentClassification paymentClassification = employee.getPaymentClassification();

        if (!Objects.equals(paymentClassification.getClass(),CommissionedClassification.class)) {
             throw new RuntimeException("关联失败，雇员不是带薪雇员");
        }

        CommissionedClassification commissionedClassification = (CommissionedClassification) paymentClassification;

        commissionedClassification.getSalesReceipts().add(salesReceipt);
    }
}
