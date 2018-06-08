package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:39:10
 **/

public abstract class ChangeAffiliationTransaction extends ChangeEmployeeTransaction {

    public ChangeAffiliationTransaction(Integer empId) {
        super(empId);
    }

    @Override
    public void change(Employee employee) {
        recordMembership(employee);
        employee.setAffiliation(getAffiliation());
    }

    /**
     * 获取雇员要修改的会员
     *
     * @author: GaoFeng2017
     * @date: 2018/6/7 16:42
     * @param:
     * @return:
     *
     */
    public abstract Affiliation getAffiliation();


    /**
     * 确定当前雇员关系
     * @author GaoFeng2017
     * @date 2018/6/7 18:11
     * @param employee 雇员对象
     * @return
     *
     */
    public abstract void recordMembership(Employee employee);
}
