package lab_19.task_01;

public class WordsCounter implements EventListener {
	private int numWords = 0;
	@Override
	public void update(String line) {
		for (String word : line.split(" ")) {
			numWords++;
		}
	}

	public int getNumWords() {
		return numWords;
	}
}
