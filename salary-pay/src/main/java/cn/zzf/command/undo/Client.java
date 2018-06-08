package cn.zzf.command.undo;

/**
 * @author GaoFeng2017
 * @date 2018-06-02 17:14:28
 **/

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.execute(new DrawCircleCommand());
        invoker.execute(new DrawCircleCommand());
        invoker.cancel();
        invoker.cancel();
        invoker.redo();
        invoker.redo();
    }
}
