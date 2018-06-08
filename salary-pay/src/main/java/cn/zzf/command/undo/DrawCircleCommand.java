package cn.zzf.command.undo;

import java.util.UUID;

/**
 * @author GaoFeng2017
 * @date 2018-06-02 16:54:43
 **/

public class DrawCircleCommand implements Command {

    private String id = UUID.randomUUID().toString();

    @Override
    public void execute() {
        //其他逻辑

        System.out.println("画圆中...." + id);
    }

    @Override
    public void cancel() {
        //其他逻辑

        System.out.println("撤销圆...." + id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DrawCircleCommand that = (DrawCircleCommand) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
