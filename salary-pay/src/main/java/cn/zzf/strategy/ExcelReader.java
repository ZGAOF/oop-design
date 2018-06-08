package cn.zzf.strategy;

import java.io.Closeable;

/**
 * @author GaoFeng2017
 * @date 2018-06-04 21:07:44
 **/

public class ExcelReader {

    public ExcelReader() {
        init();
    }

    private void init() {
        System.out.println("excel读取器初始化中");
    }

    public void read(Handler handler,int index) {
        handler.handle("读取到第" + index + "行的Excel文本");
    }

    public void close() {
        System.out.println("释放资源");
    }
}
