package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:35:29
 **/

public class ChangeDirectTransaction extends ChangeMethodTransaction {

    private String bank;
    private String account;

    public ChangeDirectTransaction(Integer empId, String bank, String account) {
        super(empId);
        this.bank = bank;
        this.account = account;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return new DirectMethod(bank,account);
    }
}
