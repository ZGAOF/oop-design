package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 10:43:01
 **/

public class DirectMethod implements PaymentMethod {
    private String Bank;
    private String account;

    public DirectMethod() {
    }

    public DirectMethod(String bank, String account) {
        Bank = bank;
        this.account = account;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    @Override
    public void pay(PayCheck payCheck) {
        payCheck.setPayMethodStr(payCheck.getPayDate() + " 支付" + Bank + account + " " + payCheck.getNetPay());
    }
}
