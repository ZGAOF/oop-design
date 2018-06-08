package cn.zzf.strategy;

/**
 * @author GaoFeng2017
 * @date 2018-06-04 21:55:33
 **/

public class Test {
    public static void main(String[] args) {
        ExcelReader reader = new ExcelReader();
        reader.read(new ArrayHandler(),1);
        reader.read(new MapHandler(),2);
        reader.close();
    }
}
