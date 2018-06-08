package cn.zzf.command.undo;

import java.util.Stack;

/**
 * @author GaoFeng2017
 * @date 2018-06-02 17:06:55
 **/

public class Invoker {



    private Stack<Command> cancels = new Stack<>();
    private Stack<Command> recovers = new Stack<>();
    private int cancelCount = 0;

    public Invoker() {

    }

    public void execute(Command command) {

        //执行命令
        command.execute();

        //把执行完的命令放入可撤销栈中
        cancels.push(command);

        //如果撤销栈超出撤销次数的限制，则删除栈尾的撤销命令
        if (cancelCount > 0 && cancels.size() > cancelCount) {
            cancels.remove(cancels.size() - 1);
        }

        //执行新命令后，重做栈要被清空(重做栈是针对撤销栈的)
        if (!recovers.isEmpty()) {
            recovers.clear();
        }
    }


    public void cancel() {
        //撤销栈如果有撤销命令就执行栈顶的命令对象的撤销操作，并从撤销栈中删除，最后存入到重做栈中
        if (!cancels.isEmpty()) {
            Command command = cancels.pop();
            command.cancel();
            recovers.push(command);
        }
    }

    public void redo() {
        //重做栈如果有重做命令，则执行并删除栈顶的重做命令
        if (!recovers.isEmpty()) {
            recovers.pop().execute();
        }
    }

}
