package lab_17.task01;

/**
 * Злітно-посадкова смуга
 */
public class Runway implements Component {

  /**
   * Чи вільна смуга
   */
  private boolean isAvailable = true;

  /**
   * Встановити стан злітно-посадкової смуги
   * @param isAvailable значення для встановлення
   */
  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  /**
   * Повертає значення чи вільна злітно-посадкова смуга
   * @return чи вільна злітно-посадкова смуга
   */
  public boolean getIsAvailable() {
    return isAvailable;
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
        setIsAvailable(true);
        broadcastMessage("Runway is available");
      }
    }
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
}
