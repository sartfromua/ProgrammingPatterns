package lab_20.task01;

public class PausedState implements State {
	private final MediaPlayer player;

	PausedState(MediaPlayer player) {
		this.player = player;
	}

	@Override
	public void play() {
		player.setState(new PlayingState(player));
		player.setIcon("play button");
		System.out.println("Video playing, icon set to " + player.getIcon());
	}

	@Override
	public void pause() {

	}
}
