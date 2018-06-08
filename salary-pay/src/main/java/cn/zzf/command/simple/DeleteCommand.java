package cn.zzf.command.simple;

/**
 * delete命令实现类
 *
 * @author GaoFeng2017
 * @date 2018-06-02 09:22:01
 **/

public class DeleteCommand implements Command{
    private Receiver receiver;

    public DeleteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.delete();
    }

}
