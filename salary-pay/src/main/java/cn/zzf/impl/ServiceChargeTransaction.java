package cn.zzf.impl;

import java.util.Date;
import java.util.LinkedList;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 13:40:22
 **/

public class ServiceChargeTransaction implements Transaction {

    private Integer memberId;
    private Date date;
    private Double amount;
    private EmpDB db  = EmpDB.getDB();


    public ServiceChargeTransaction() {
    }

    public ServiceChargeTransaction(Integer memberId, Date date, Double amount) {
        this.memberId = memberId;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public void execute() {
        Employee employee = db.getMember(memberId);
        UnionAffiliation unionAffiliation = (UnionAffiliation) employee.getAffiliation();
        unionAffiliation.getServiceCharges().add(new ServiceCharge(date,amount));
    }
}
