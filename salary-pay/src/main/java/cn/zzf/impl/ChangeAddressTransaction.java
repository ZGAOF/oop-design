package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 15:41:53
 **/

public class ChangeAddressTransaction extends ChangeEmployeeTransaction {

    private String address;

    public ChangeAddressTransaction(Integer empId, String address) {
        super(empId);
        this.address = address;
    }

    @Override
    public void change(Employee employee) {
        employee.setAddress(address);
    }
}
