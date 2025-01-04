package command;

public class AdjustVolumeCommand implements Command {

	Stereo stereo;

	public AdjustVolumeCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.ChangeVolume();

	}

}
