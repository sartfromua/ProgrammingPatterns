package lab_06.task02;

import lab_06.task02.builders.SUVBuilder;
import lab_06.task02.builders.SedanBuilder;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Director director = Director.getDirector();
                director.changeBuilder(new SUVBuilder());
                Car carSUV = director.makeCar();

                System.out.println(carSUV);
                System.out.println(director);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Director director = Director.getDirector();
                director.changeBuilder(new SedanBuilder());
                Car carSedan = director.makeCar();

                System.out.println(carSedan);
                System.out.println(director);
            }
        });

        t1.start();
        t2.start();

    }
}
