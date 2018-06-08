package cn.zzf.templet.method;

/**
 * @author GaoFeng2017
 * @date 2018-06-04 09:27:58
 **/

public class TemplateOtherImpl extends AbstractTemplate {
    @Override
    protected void step4() {
        System.out.println("TemplateOtherImpl特有的具体实现");
        super.step2();
    }

    public static void main(String[] args) {
        TemplateOtherImpl templateOther = new TemplateOtherImpl();
        templateOther.run();
    }
}
