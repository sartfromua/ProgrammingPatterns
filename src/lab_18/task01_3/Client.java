package lab_18.task01_3;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        TriangleCaretaker caretaker = new TriangleCaretaker();

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
        };

        float S_max = 0;
        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    caretaker.pushMemento(triangle.save());
                    triangle.setA(values[index]);
                    break;
                case "b":
                    caretaker.pushMemento(triangle.save());
                    triangle.setB(values[index]);
                    break;
                case "c":
                    caretaker.pushMemento(triangle.save());
                    triangle.setC(values[index]);
                    break;
            }
			S_max = Math.max(triangle.square(), S_max);
            System.out.println("S = " + triangle.square());
        }

        while (triangle.square() != S_max) {
            caretaker.undo();
        }

        System.out.println("max S = " + triangle.square());


    }

}
