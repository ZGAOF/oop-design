package cn.zzf.impl;

import java.util.Date;
import java.util.LinkedList;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 10:59:57
 **/

public class UnionAffiliation implements Affiliation {

    private Integer memberId;
    private double dues;
    private LinkedList<ServiceCharge> serviceCharges = new LinkedList<>();

    public UnionAffiliation() {

    }


    public UnionAffiliation(Integer memberId, double dues) {
        this.memberId = memberId;
        this.dues = dues;
    }

    public double getDues() {
        return dues;
    }

    public void setDues(double dues) {
        this.dues = dues;
    }

    public LinkedList<ServiceCharge> getServiceCharges() {
        return serviceCharges;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Override
    public Double calculateDeductions(PayCheck payCheck) {
        Date aDate = payCheck.getPayStartTime();
        Date bDate = payCheck.getPayDate();
        int count = DateUtil.getFridayCount(aDate,bDate);
        Double sum = dues * count;
        for (ServiceCharge serviceCharge : serviceCharges) {
            if (DateUtil.isBetweenDate(serviceCharge.getDate(),aDate,bDate)) {
                sum += serviceCharge.getAmount();
            }
        }
        return sum;
    }
}
