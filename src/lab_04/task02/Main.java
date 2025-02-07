package lab_04.task02;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String str = builder.setLine("Some text")
                .insert("|Inserted text|", 2)
                .append("|Text added in the end|")
                .makeString();
        System.out.println(str);
    }
}
