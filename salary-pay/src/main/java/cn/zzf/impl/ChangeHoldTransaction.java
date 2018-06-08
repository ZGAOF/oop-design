package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:25:01
 **/

public class ChangeHoldTransaction extends ChangeMethodTransaction {

    public ChangeHoldTransaction(Integer empId) {
        super(empId);
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return new HoldMethod();
    }
}
