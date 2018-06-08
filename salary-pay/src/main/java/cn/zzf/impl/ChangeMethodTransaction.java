package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:22:16
 **/

public abstract class ChangeMethodTransaction extends ChangeEmployeeTransaction {

    public ChangeMethodTransaction(Integer empId) {
        super(empId);
    }

    @Override
    public void change(Employee employee) {
        employee.setPaymentMethod(getPaymentMethod());
    }

    /**
     * 获取雇员要改变的支付方法
     * @author: GaoFeng2017
     * @date: 2018/6/7 16:23
     * @param:
     * @return:
     *
     */
    public abstract PaymentMethod getPaymentMethod();
}
