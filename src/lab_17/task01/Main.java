package lab_17.task01;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    PlanesInFlight planesInFlight = new PlanesInFlight();
    PlanesOnGround planesOnGround = new PlanesOnGround();
    Runway runway = new Runway();

    PlanesManager dispatcher = new PlanesManager();

    planesInFlight.setMediator(dispatcher);
    planesOnGround.setMediator(dispatcher);
    runway.setMediator(dispatcher);

    dispatcher.addComponent(planesInFlight);
    dispatcher.addComponent(planesOnGround);
    dispatcher.addComponent(runway);

    Plane[] planes = {
            new Plane(123),
            new Plane(456),
            new Plane(789),
            new Plane(983),
    };

    for (Plane plane : planes) {
      dispatcher.addComponent(plane);
      plane.setMediator(dispatcher);
    }

    runway.broadcastMessage("Runway is available");

    planes[0].takeOff();
    planes[1].takeOff();
    planes[2].takeOff();

    planes[1].land();
    planes[2].land();
  }

}
