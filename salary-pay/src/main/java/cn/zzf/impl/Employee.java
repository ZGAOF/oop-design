package cn.zzf.impl;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 14:48:51
 *
 **/

public class Employee {

    private String name;
    private String address;
    private Integer employeeId;
    private PaymentClassification paymentClassification;
    private PaymentMethod paymentMethod;
    private PaymentSchedule paymentSchedule;
    private Affiliation affiliation;

    public Employee(String name, String address, Integer employeeId) {
        this.name = name;
        this.address = address;
        this.employeeId = employeeId;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public PaymentClassification getPaymentClassification() {
        return paymentClassification;
    }

    public void setPaymentClassification(PaymentClassification paymentClassification) {
        this.paymentClassification = paymentClassification;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentSchedule getPaymentSchedule() {
        return paymentSchedule;
    }

    public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }

    public Date getStartPayDate(Date date) {
        return paymentSchedule.getStartPayDate(date);
    }

    public void PayDay(PayCheck payCheck) {
        Double grossPay = paymentClassification.calculatePay(payCheck);
        Double deductions = affiliation.calculateDeductions(payCheck);
        Double netPay = grossPay - deductions;
        payCheck.setDeductions(deductions);
        payCheck.setGrossPay(grossPay);
        payCheck.setNetPay(netPay);
        paymentMethod.pay(payCheck);
    }

}
