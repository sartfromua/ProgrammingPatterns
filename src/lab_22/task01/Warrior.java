package lab_22.task01;

public abstract class Warrior {
	abstract void pickUpWeapon();

	abstract void defenseAction();

	abstract void moveToSafety();

	public void defendAgainstAttack() {
		pickUpWeapon();
		defenseAction();
		moveToSafety();
		System.out.println();
	}
}
