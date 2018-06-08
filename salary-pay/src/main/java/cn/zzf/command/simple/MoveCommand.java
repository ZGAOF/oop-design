package cn.zzf.command.simple;

/**
 * @author GaoFeng2017
 * @date 2018-06-02 09:31:29
 **/

public class MoveCommand implements Command{
    private Receiver receiver;

    public MoveCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.move();
    }

}

