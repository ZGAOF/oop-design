package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 15:37:12
 **/

public abstract class ChangeEmployeeTransaction implements Transaction{
    private Integer empId;
    private EmpDB db = EmpDB.getDB();

    public ChangeEmployeeTransaction(Integer empId) {
        this.empId = empId;
    }

    public ChangeEmployeeTransaction() {
    }

    @Override
    public void execute() {
        Employee e = db.getEmployee(empId);
        if (e != null) {
            change(e);
        }
    }

    /** 改变雇员属性 */
    public abstract void change(Employee employee);
}
