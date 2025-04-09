package lab_19.task_01;

public class Main {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader("src/lab_19/task_01/input01.txt");

        LongestLineFinder longestLineFinder = new LongestLineFinder();
        LongestWordFinder longestWordFinder = new LongestWordFinder();
        WordsCounter wordsCounter = new WordsCounter();
        LineWithLongestWordFinder lineWithLongestWordFinder = new LineWithLongestWordFinder();

        fileReader.eventManager.subscribe(longestLineFinder);
        fileReader.eventManager.subscribe(longestWordFinder);
        fileReader.eventManager.subscribe(wordsCounter);
        fileReader.eventManager.subscribe(lineWithLongestWordFinder);

        fileReader.read();

        System.out.println("Longest line: " + longestLineFinder.getLongestLine());
        System.out.println("Longest word: " + longestWordFinder.getLongestWord());
        System.out.println("Words counter: " + wordsCounter.getNumWords());
        System.out.println("Line with longest word: " + lineWithLongestWordFinder.getLineWithLongestWord());

    }

}
