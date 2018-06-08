package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 10:49:21
 **/

public class MailMethod implements PaymentMethod {
    private String address;

    public MailMethod() {
    }

    public MailMethod(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void pay(PayCheck payCheck) {
        payCheck.setPayMethodStr(payCheck.getPayDate() + " 邮寄支付" + address + " " + payCheck.getNetPay());
    }

}
