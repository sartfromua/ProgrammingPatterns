package lab_06.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileProvider provider = FileProvider.getInstance();
        Scanner scanner = provider.getScanner("SomeFile.txt");
        System.out.println(scanner.nextLine());
    }
}
