package lab_17.task01;

import lab_17.task01.Plane;

import java.util.ArrayList;

/**
 * Літаки у повітрі
 */
public class PlanesInFlight implements Component {

  /**
   * Список літаків
   */
  ArrayList<Plane> planes = new ArrayList<>();

  /**
   * Додати літак
   * @param plane літак
   */
  public void addPlane(Plane plane) {
    planes.add(plane);
  }

  /**
   * Видалити літак зі списку
   * @param plane літак
   */
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
        addPlane((Plane) componentFrom);
      }
      if (message.contains("landing")) {
        removePlane((Plane) componentFrom);
      }
      System.out.println("PlanesInFlight: " + planes.toString());
    }
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
}
