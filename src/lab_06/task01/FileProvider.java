package lab_06.task01;


import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class FileProvider {
    private static FileProvider instance;
    private static ReentrantLock mutex = new ReentrantLock();

    private FileProvider() {}

    public static FileProvider getInstance() {
        if (instance == null) {
            mutex.lock();
            if (instance == null) instance = new FileProvider();
            mutex.unlock();
        }
        return instance;
    }

    public Scanner getScanner(String fileName) {
        try {
            File f = new File(fileName);
            return new Scanner(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
