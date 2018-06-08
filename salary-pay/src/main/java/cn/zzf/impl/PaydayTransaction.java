package cn.zzf.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 20:31:48
 **/

public class PaydayTransaction implements Transaction {

    private Date date;
    private EmpDB db = EmpDB.getDB();
    public static  Map<Integer,PayCheck> map = new HashMap<>(16);

    public PaydayTransaction(Date date) {
        this.date = date;
    }

    @Override
    public void execute() {
        List<Employee> employees = db.getAll();
        for (Employee employee : employees) {
            System.out.println(employee.getPaymentSchedule().isPayDay(date));
            if (employee.getPaymentSchedule().isPayDay(date)) {
                PayCheck payCheck = new PayCheck(employee.getStartPayDate(date),date);
                employee.PayDay(payCheck);
                map.put(employee.getEmployeeId(),payCheck);
            }
        }
    }
}
