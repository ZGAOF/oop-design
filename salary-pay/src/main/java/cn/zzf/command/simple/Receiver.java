package cn.zzf.command.simple;

/**
 * 接受者，也叫执行者
 *
 * @author GaoFeng2017
 * @date 2018-06-02 09:00:40
 **/

public class Receiver {
    public void copy() {
        System.out.println("复制文件");
    }

    public void paste() {
        System.out.println("粘贴文件");
    }

    public void delete() {
        System.out.println("删除文件");
    }

    public void move() {
        System.out.println("移动文件");
    }
}




