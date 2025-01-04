package command;

public class MainClass {
	public static void main(String[] args) {
		Device d1 = new TV();
		Device d2 = new Stereo();

		Command c1 = new TurnOnCommand(d1);

		Command c2 = new TurnOffCommand(d1);

		Command c3 = new ChangeChannelCommand((TV) d1);

		Command c4 = new TurnOffCommand(d2);

		Command c5 = new TurnOnCommand(d2);

		Command c6 = new AdjustVolumeCommand((Stereo) d2);

		c1.execute();
		c2.execute();
		c3.execute();
		c4.execute();
		c5.execute();
		c6.execute();

	}
}
