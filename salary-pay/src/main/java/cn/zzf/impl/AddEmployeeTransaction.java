package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 14:38:11
 **/

public abstract class AddEmployeeTransaction implements Transaction {

    private EmpDB db = EmpDB.getDB();

    /** 雇员姓名 */
    private String name;

    /** 雇员住址 */
    private String address;

    /** 雇员Id */
    private Integer EmpId;

    public AddEmployeeTransaction(String name, String address, Integer empId) {
        this.name = name;
        this.address = address;
        EmpId = empId;
    }

    @Override
    public void execute() {
        Employee e = new Employee(this.name,this.address,this.EmpId);
        PaymentMethod method = new HoldMethod();
        e.setPaymentClassification(getPaymentClassification());
        e.setPaymentSchedule(getPaymentSchedule());
        e.setPaymentMethod(new HoldMethod());
        e.setAffiliation(new NoAffiliation());
        db.addEmployee(e);
    }

    /**
     * 获取雇员支付策略
     * @author: GaoFeng2017
     * @date: 2018/6/6 15:54
     * @param:
     * @return:
     *
     */
    public abstract PaymentClassification getPaymentClassification();

    /**
     * 获取支付时间表
     * @author: GaoFeng2017
     * @date: 2018/6/7 11:33
     * @param:
     * @return:
     *
     */
    public abstract PaymentSchedule getPaymentSchedule();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getEmpId() {
        return EmpId;
    }

    public void setEmpId(Integer empId) {
        EmpId = empId;
    }
}
