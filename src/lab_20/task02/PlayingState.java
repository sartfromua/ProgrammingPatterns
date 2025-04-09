package lab_20.task02;

public class PlayingState implements State {
	private MediaPlayer mediaPlayer;

	PlayingState(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void play() {

	}

	@Override
	public void pause() {
		mediaPlayer.setState(new PausedState(mediaPlayer));
	}

	@Override
	public void next() {
		mediaPlayer.pause();
		mediaPlayer.setTrackNum((mediaPlayer.getCurrentTrackNum()+1) % mediaPlayer.getTracks().size());
		mediaPlayer.play();
	}

	@Override
	public void prev() {
		mediaPlayer.pause();
		mediaPlayer.setTrackNum((mediaPlayer.getCurrentTrackNum()-1) % mediaPlayer.getTracks().size());
		mediaPlayer.play();
	}

	@Override
	public void stop() {
		mediaPlayer.setState(new StoppedState(mediaPlayer));
	}
}
