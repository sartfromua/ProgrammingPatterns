package lab_20.task02;

import lab_20.task02.MediaPlayer;

public class PausedState implements State {

	private final MediaPlayer mediaPlayer;

	PausedState(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void play() {
		mediaPlayer.setState(new PlayingState(mediaPlayer));
		System.out.println("Playing " + mediaPlayer.getCurrentTrack());
	}

	@Override
	public void pause() {

	}

	@Override
	public void next() {

	}

	@Override
	public void prev() {

	}

	@Override
	public void stop() {
		mediaPlayer.setState(new StoppedState(mediaPlayer));
	}
}
