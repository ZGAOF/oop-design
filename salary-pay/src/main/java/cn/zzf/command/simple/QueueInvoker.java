package cn.zzf.command.simple;

import java.util.LinkedList;

/**
 * 请求队列
 *
 * @author GaoFeng2017
 * @date 2018-06-02 13:14:52
 **/

public class QueueInvoker {
    private LinkedList<Command> commands = new LinkedList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void action() {
        for (Command command : commands) {
            command.execute();
            System.out.println("命令" + command + "已被记录");
        }
    }
}
