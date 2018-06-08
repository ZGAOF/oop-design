package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:28:53
 **/

public class ChangeMailTransaction extends ChangeMethodTransaction {

    private String address;

    public ChangeMailTransaction(Integer empId, String address) {
        super(empId);
        this.address = address;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return new MailMethod(address);
    }

}
