package lab_19.task_01;

public class LongestLineFinder implements EventListener {
	private String longestLine = "";

	@Override
	public void update(String line) {
		if (line.length() > longestLine.length()) {
			longestLine = line;
		}
	}

	public String getLongestLine() {
		return longestLine;
	}
}
