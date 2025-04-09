package lab_17.task01;

import java.util.ArrayList;

/**
 * Літаки, що приземлилися
 */
public class PlanesOnGround implements Component {

  ArrayList<Plane> planes = new ArrayList<>();

  public void addPlane(Plane plane) {
    planes.add(plane);
  }

  public void removePlane(Plane plane) {
    planes.remove(plane);
  }

  private Mediator mediator;

  @Override
  public void broadcastMessage(String message) {
    mediator.broadcast(this, message);
  }

  @Override
  public void handleMessage(Component componentFrom, String message) {
    if (componentFrom instanceof Plane) {
      if (message.contains("taking off")) {
        removePlane((Plane) componentFrom);
      }
      if (message.contains("landing") || message.contains("is on ground")) {
        addPlane((Plane) componentFrom);
      }
      System.out.println("PlanesOnGround: " + planes.toString());
    }
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
}
