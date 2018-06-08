package cn.zzf.command.simple;

/**
 * 装配者，用于创建命令对象以及设置命令对象的接收者
 *
 * @author GaoFeng2017
 * @date 2018-06-02 09:40:50
 **/

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        CopyCommand copyCommand = new CopyCommand(receiver);
        PasteCommand pasteCommand = new PasteCommand(receiver);
        DeleteCommand deleteCommand = new DeleteCommand(receiver);

//        Invoker invoker = new Invoker(copyCommand,pasteCommand,deleteCommand);
        QueueInvoker queueInvoker = new QueueInvoker();
        queueInvoker.addCommand(new CopyCommand(receiver));
        queueInvoker.addCommand(new PasteCommand(receiver));
        queueInvoker.addCommand(new DeleteCommand(receiver));
        queueInvoker.action();
    }
}
