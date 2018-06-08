package cn.zzf.impl;

/**
 * @author GaoFeng2017
 * @date 2018-06-07 16:49:04
 **/

public class ChangeMemberTransaction extends ChangeAffiliationTransaction {

    private Double dus;
    private Integer memberId;
    private EmpDB db = EmpDB.getDB();

    public ChangeMemberTransaction(Integer empId, Double dus, Integer memberId) {
        super(empId);
        this.dus = dus;
        this.memberId = memberId;
    }

    @Override
    public Affiliation getAffiliation() {
        return new UnionAffiliation(memberId,dus);
    }

    @Override
    public void recordMembership(Employee employee) {
        db.addUnionAffiliation(memberId,employee);
    }

}
