package lab_05.task02;

import lab_05.task02.builders.SUVBuilder;
import lab_05.task02.builders.SedanBuilder;

public class Main {

    public static void main(String[] args) {
        Director director = new Director(new SUVBuilder());
        Car carSUV = director.makeCar();
        director.changeBuilder(new SedanBuilder());
        Car carSedan = director.makeCar();
        Car clonedSedan = carSedan.clone();

        System.out.println(carSedan);
        System.out.println(carSUV);
        System.out.println(clonedSedan);
    }
}
