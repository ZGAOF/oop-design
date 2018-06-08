package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 15:49:35
 *
 **/

public abstract class ChangeClassificationTransaction extends ChangeEmployeeTransaction {

    public ChangeClassificationTransaction(Integer empId) {
        super(empId);
    }

    @Override
    public void change(Employee employee) {
        employee.setPaymentClassification(getPaymentClassification());
        employee.setPaymentSchedule(getPaymentSchedule());
    }

    /**
     * 获取雇员要更改的支付策略
     * @author: GaoFeng2017
     * @date: 2018/6/7 16:00
     * @param:
     * @return:
     *
     */
    public abstract PaymentClassification getPaymentClassification();

    /**
     * 获取雇员要更改的薪水支付时间表
     * @author: GaoFeng2017
     * @date: 2018/6/7 16:00
     * @param:
     * @return:
     *
     */
    public abstract PaymentSchedule getPaymentSchedule();
}
