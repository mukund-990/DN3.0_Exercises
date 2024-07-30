public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl(lightOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}