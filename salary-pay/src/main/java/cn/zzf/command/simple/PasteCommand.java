package cn.zzf.command.simple;

/**
 * paste命令实现类
 *
 * @author GaoFeng2017
 * @date 2018-06-02 09:16:10
 **/

public class PasteCommand implements Command {

    private Receiver receiver;

    public PasteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.paste();
    }
}