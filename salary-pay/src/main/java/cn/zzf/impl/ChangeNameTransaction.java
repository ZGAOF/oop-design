package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 15:44:39
 **/

public class ChangeNameTransaction extends ChangeEmployeeTransaction {

    private String name;

    public ChangeNameTransaction(Integer empId, String name) {
        super(empId);
        this.name = name;
    }

    @Override
    public void change(Employee employee) {
        employee.setName(name);
    }
}
