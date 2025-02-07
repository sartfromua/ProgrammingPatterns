package lab_04.task02;

public class StringBuilder {
    private String line;

    public StringBuilder setLine(String str) {
        this.line = str;
        return this;
    }

    public StringBuilder append(String str) {
        line += str;
        return this;
    }

    public StringBuilder insert(String str, int position) {
        line = line.substring(0, position) + str + line.substring(position);
        return this;
    }

    public String makeString() {
        return line;
    }
}
