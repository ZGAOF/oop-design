package cn.zzf.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author GaoFeng2017
 * @date 2018-06-06 14:48:36
 **/

public class EmpDB {

    private Map<Integer,Employee> employees = new HashMap<>(16);
    private Map<Integer,Employee> members = new HashMap<>(16);

    private static EmpDB db = new EmpDB();

    private EmpDB() {
    }

    public Employee getEmployee(Integer employeeId) {
        return employees.get(employeeId);
    }

    public List<Employee> getAll() {
        return new ArrayList<>(employees.values());
    }

    public boolean removeEmployee(Integer employeeId) {
        return employees.remove(employeeId) != null;
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getEmployeeId(),employee);
    }

    public void clear() {
        employees.clear();
    }

    public Employee getMember(Integer memberIds) {
        return members.get(memberIds);
    }

    public void addUnionAffiliation(Integer memberId,Employee employee) {
        members.put(memberId,employee);
    }

    public void removeUnionAffiliation(Integer memberId) {
        members.remove(memberId);
    }

    public static EmpDB getDB() {
        return db;
    }
}
