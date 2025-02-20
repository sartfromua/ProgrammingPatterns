package lab_08.task02;

public abstract class Button {
    protected Size size;

    void draw() {
        System.out.println("Setting size to " + size.getSize());
    }

}
