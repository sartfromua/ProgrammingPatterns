package lab_17.task01;

/**
 * Літак
 */
public class Plane implements Component{

  /**
   * Чи злетів літак
   */
  private boolean isInTheAir;

  /**
   * Ідентифікатор літака
   */
  private int id;

  private boolean isRunwayAvailable;


  public Plane(int id) {
    this.id = id;
    isInTheAir = false;
    broadcastMessage("Plane is on ground");
  }

  /**
   * Зліт літака
   */
  public void takeOff() {
//    if(!isInTheAir && runway.getIsAvailable()) {
    if(!isInTheAir && isRunwayAvailable) {
      mediator.broadcast(this, "Plane is taking off");
//      runway.setIsAvailable(false);
//      planesInFlight.add(this);
//      planesOnGround.remove(this);
      setIsInTheAir(true);
    }
  }

  public void land() {
    if(isInTheAir && isRunwayAvailable) {
      mediator.broadcast(this, "Plane is landing");
      setIsInTheAir(false);
    }
  }

  /**
   * Повертає ознаку чи літак в повітрі
   * @return стан літака - чи в повітрі
   */
  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  /**
   * Встановити ознаку чи злетів літак
   * @param isInTheAir чи злетів літак
   */
  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  /**
   * Ідентифікатор літака
   * @return ідентифікатор
   */
  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Plane [isInTheAir=" + isInTheAir + ", id=" + id + "]";
  }


  private Mediator mediator;

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void broadcastMessage(String message) {
    if (mediator != null) {
      mediator.broadcast(this, message);
    }
  }

  @Override
  public void handleMessage(Component componentFrom, String message) {
    if (componentFrom instanceof Runway) {
      if (message.contains("Runway is available")) {
        isRunwayAvailable = true;
      }
    }
  }
}
