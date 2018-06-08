package cn.zzf.active.object;

/**
 * @author GaoFeng2017
 * @date 2018-06-03 15:45:37
 **/

public class Test {
    private boolean stop = false;

    @org.junit.Test
    public void test() {
        ActiveObjectEngine engine = new ActiveObjectEngine();
        Command command = new Command() {
            @Override
            public void execute() {
                stop = true;
            }
        };

        long time = System.currentTimeMillis();
        SleepCommand sleepCommand = new SleepCommand(command,1000,engine);
        engine.addCommand(sleepCommand);
        engine.run();
        System.out.println(stop);
        System.out.println(System.currentTimeMillis() - time);

    }

}
