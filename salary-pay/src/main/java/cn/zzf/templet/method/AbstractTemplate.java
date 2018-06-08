package cn.zzf.templet.method;

/**
 * @author GaoFeng2017
 * @date 2018-06-03 23:22:29
 **/

public abstract class AbstractTemplate
{

    protected String name;

    private void step1() {
        System.out.println("不可改变的固定步骤1");
    }

    protected final void step2() {
        System.out.println("不可改变但可被子类调用的固定步骤2");
    }

    private void step3() {
        System.out.println("不可改变的的固定步骤3");
    }

    protected abstract void step4();

    /**
     * step1的钩子方法
     */
    protected boolean isDoStep1() {
        return true;
    }

    /**
     * 空实现的钩子方法
     */
    protected void hookStep() {

    }

    public final void run() {
        if (isDoStep1()) {
            step1();
        } else {
            step3();
        }
        step2();
        step4();
        hookStep();
    }
}
