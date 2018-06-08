package cn.zzf.impl;

import java.util.Objects;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:52:27
 **/

public class ChangeNoMemberTransaction extends ChangeAffiliationTransaction {

    private EmpDB db = EmpDB.getDB();

    public ChangeNoMemberTransaction(Integer empId) {
        super(empId);
    }

//    private

    @Override
    public Affiliation getAffiliation() {
        return new NoAffiliation();
    }

    @Override
    public void recordMembership(Employee employee) {
        Affiliation affiliation = employee.getAffiliation();

        if (Objects.equals(affiliation.getClass(),NoAffiliation.class)) {
            return;
        }

        UnionAffiliation unionAffiliation = (UnionAffiliation) affiliation;

        db.removeUnionAffiliation(unionAffiliation.getMemberId());
    }


}
