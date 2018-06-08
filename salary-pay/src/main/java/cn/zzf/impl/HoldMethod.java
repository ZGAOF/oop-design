package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 10:39:53
 **/

public class HoldMethod implements PaymentMethod {

    @Override
    public void pay(PayCheck payCheck) {
       payCheck.setPayMethodStr(payCheck.getPayDate() + " 支票支付 " + payCheck.getNetPay());
    }
}
