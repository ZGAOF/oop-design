package cn.zzf.templet.method;

/**
 * @author GaoFeng2017
 * @date 2018-06-04 09:20:38
 **/

public class TemplateImpl extends AbstractTemplate {

    @Override
    protected void step4() {
        System.out.println("TemplateImpl特有的具体实现");
    }

    @Override
    protected boolean isDoStep1() {
        return false;
    }

    @Override
    protected void hookStep() {
        System.out.println("缺省钩子方法的具体实现");
    }

    public static void main(String[] args) {
        TemplateImpl template = new TemplateImpl();
        template.run();
    }
}
