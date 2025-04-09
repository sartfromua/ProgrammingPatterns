package lab_19.task_01;

public class LineWithLongestWordFinder implements EventListener {
	private String lineWithLongestWord;
	private String longestWord = "";
	@Override
	public void update(String line) {
		for (String word : line.split(" ")) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
				lineWithLongestWord = line;
			}
		}
	}

	public String getLineWithLongestWord() {
		return lineWithLongestWord;
	}
}
