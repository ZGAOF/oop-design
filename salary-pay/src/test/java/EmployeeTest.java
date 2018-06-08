import cn.zzf.impl.*;
import org.junit.Test;

import java.util.Date;

/**
 * @author GaoFeng2017
 * @date 2018-06-08 14:55:20
 **/

public class EmployeeTest {

    @Test
    public void test() {
        Date date = DateUtil.getDate(2018,6,8);
        AddEmployeeTransaction addTransaction = new AddCommissionedTransaction("Bob","Home",1,1000.0,108.0);
        addTransaction.execute();

        Date sd = DateUtil.getDate(2018, 6, 7);

        SalesReceiptTransaction salesReceiptTransaction = new SalesReceiptTransaction(1,new SalesReceipt(sd,3));
        salesReceiptTransaction.execute();

        //加入协会
        ChangeMemberTransaction changeMemberTransaction = new ChangeMemberTransaction(1,200.0,7734);
        changeMemberTransaction.execute();

        //协会收取服务费
        ServiceChargeTransaction serviceChargeTransaction = new ServiceChargeTransaction(7734,sd,66.6);
        serviceChargeTransaction.execute();

        //退出协会
        ChangeNoMemberTransaction changeNoMemberTransaction = new ChangeNoMemberTransaction(1);
        changeNoMemberTransaction.execute();

        //带薪员工变成钟点工
        ChangeClassificationTransaction changeClassificationTransaction = new ChangeHourlyTransaction(1,42.0);
        changeClassificationTransaction.execute();
        TimeCardTransaction timeCardTransaction = new TimeCardTransaction(1,new TimeCard(sd,10));
        timeCardTransaction.execute();

        //钟点工变成月薪工
        ChangeMonthlyTransaction changeMonthlyTransaction = new ChangeMonthlyTransaction(1,4500.0);
        changeMonthlyTransaction.execute();

        addTransaction = new AddHourlyEmployeeTransaction("Mike","School",2,8.0);
        addTransaction.execute();
        timeCardTransaction = new TimeCardTransaction(2,new TimeCard(sd,8));
        timeCardTransaction.execute();
        ChangeMailTransaction changeMailTransaction = new ChangeMailTransaction(2,"江西九江");
        changeMailTransaction.execute();

        addTransaction = new AddMonthlyEmployeeTransaction("GaoFeng","BeiJing",3,10000);
        addTransaction.execute();



        PaydayTransaction paydayTransaction = new PaydayTransaction(date);
        paydayTransaction.execute();
        System.out.println(PaydayTransaction.map.get(1));
        System.out.println(PaydayTransaction.map.get(2));
        System.out.println(PaydayTransaction.map.get(3));
    }
}
