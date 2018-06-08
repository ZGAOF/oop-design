package cn.zzf.strategy;

/**
 * @author GaoFeng2017
 * @date 2018-06-04 21:51:40
 **/

public class MapHandler implements Handler {
    @Override
    public void handle(String content) {
        System.out.println(content + "，已被转为map对象");
    }
}
