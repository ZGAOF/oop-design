package cn.zzf.command.undo;

/**
 * @author GaoFeng2017
 * @date 2018-06-02 16:01:09
 **/

public interface Command {
    void execute();
    void cancel();
}
