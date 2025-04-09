package lab_16.task03;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

//        final Box root = new Box(BoxLayout.X_AXIS);

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            final Box root = new Box(BoxLayout.X_AXIS);

            for (int j = 0; j < 10; j++) {
                final Box box = new Box(BoxLayout.Y_AXIS);
                root.add(box);
                box.add(new JLabel("Box_"+j));
                for (int i = 0; i < 10; i++) {

                    String name = String.format("Item_%s", j * 10 + i);
                    int value = random.nextInt(1000);
                    final Item item = new Item(name, value);
                    box.add(item);
                    box.add(new JLabel(String.valueOf(value)));
                }
                System.out.println();
            }

            frame.add(root);

//            System.out.println(Arrays.toString(root));

            frame.setSize(600, 400);
            frame.setVisible(true);
        });



//        root.execute();

    }
}
