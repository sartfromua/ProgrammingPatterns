package lab_22.task01;

/**
 * Пірат
 */
public class Pirate extends Warrior {

  /**
   * Підняти зброю для захисту - оголити меч
   */
  public void pickUpWeapon() {
    System.out.println("Pick up sword");
  }

  /**
   * Захист
   */
  public void defenseAction() {
    System.out.println("Defend with sword");
  }

  /**
   * Повернення героя в безпечне місце
   */
  public void moveToSafety() {
    System.out.println("Return to the ship");
  }

}
