package cn.zzf.command.simple;

/**
 * copy命令实现类
 *
 * @author GaoFeng2017
 * @date 2018-06-02 09:11:52
 **/

public class CopyCommand implements Command {

    private Receiver receiver;

    public CopyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.copy();
    }
}
