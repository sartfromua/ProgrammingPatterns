package lab_20.task01;

public class PlayingState implements State {
	private final MediaPlayer player;

	PlayingState(MediaPlayer player) {
		this.player = player;
	}

	@Override
	public void play() {

	}

	@Override
	public void pause() {
		player.setState(new PausedState(player));
		player.setIcon("paused icon");
		System.out.println("Video paused, icon set to " + player.getIcon());
	}
}
