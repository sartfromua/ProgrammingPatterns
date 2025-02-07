package lab_04.task01;

import lab_04.task01.builders.Builder;
import lab_04.task01.builders.SUVBuilder;
import lab_04.task01.builders.SedanBuilder;
import lab_04.task01.builders.TransmissionBuilder;
import lab_04.task01.parts.Body;
import lab_04.task01.parts.Engine;
import lab_04.task01.parts.Transmission;
import lab_04.task01.parts.Wheel;

public class Main {

    public static void main(String[] args) {
        Director director = new Director(new SUVBuilder());
        Car carSUV = director.makeCar();
        director.changeBuilder(new SedanBuilder());
        Car carSedan = director.makeCar();

        System.out.println(carSedan);
        System.out.println(carSUV);
    }
}
