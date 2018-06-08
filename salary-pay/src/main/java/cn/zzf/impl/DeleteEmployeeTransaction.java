package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 11:42:42
 **/

public class DeleteEmployeeTransaction implements Transaction{

    private Integer empId;
    private EmpDB db = EmpDB.getDB();

    public DeleteEmployeeTransaction(Integer empId) {
        this.empId = empId;
    }

    @Override
    public void execute() {
        db.removeEmployee(empId);
    }
}
