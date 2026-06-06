package Exercise9;

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command c1 = new LightOnCommand(light);
        Command c2 = new LightOffCommand(light);
        RemoteControl r = new RemoteControl();
        r.setCommand(c1);
        r.executeCommand();
        r.setCommand(c2);
        r.executeCommand();
    }
}
