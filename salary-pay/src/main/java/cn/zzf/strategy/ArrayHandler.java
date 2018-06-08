package cn.zzf.strategy;

/**
 * @author GaoFeng2017
 * @date 2018-06-04 21:50:43
 **/

public class ArrayHandler implements Handler {

    @Override
    public void handle(String content) {
        System.out.println(content + "，已被转换为数组对象");
    }
}
