package cn.zzf.active.object;
import java.util.LinkedList;

/**
 * @author GaoFeng2017
 * @date 2018-06-03 15:29:24
 **/

public class ActiveObjectEngine {

    private LinkedList<Command> taskList = new LinkedList<>();

    public void addCommand(Command command) {
        taskList.add(command);
    }

    public void run() {
        while (!taskList.isEmpty()) {
            Command command = taskList.removeFirst();
            command.execute();
        }
    }
}
