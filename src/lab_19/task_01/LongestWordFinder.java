package lab_19.task_01;

public class LongestWordFinder implements EventListener {
	private String longestWord = "";
	@Override
	public void update(String line) {
		for (String word : line.split(" ")) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
	}

	public String getLongestWord() {
		return longestWord;
	}
}
