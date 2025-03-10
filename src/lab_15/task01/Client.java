package lab_15.task01;

public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerUniversal = new Controller();

        // Simulation

        controllerUniversal.on(kitchenLamp);
        controllerUniversal.off(kitchenLamp);

        controllerUniversal.on(hallLamp);
        controllerUniversal.off(hallLamp);

        controllerUniversal.on(bathroomLamp);
        controllerUniversal.off(bathroomLamp);

    }
}
