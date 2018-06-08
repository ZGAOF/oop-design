package cn.zzf.command.simple;

/**
 * 调用者
 * @author GaoFeng2017
 * @date 2018-06-02 09:32:56
 **/

public class Invoker {
    private Command copyCommand;
    private Command pasteCommand;
    private Command deleteCommand;

    public Invoker(Command copyCommand, Command pasteCommand, Command deleteCommand) {
        this.copyCommand = copyCommand;
        this.pasteCommand = pasteCommand;
        this.deleteCommand = deleteCommand;
    }

    public void action() {
        this.copyCommand.execute();
        this.pasteCommand.execute();
        this.deleteCommand.execute();
    }

}
