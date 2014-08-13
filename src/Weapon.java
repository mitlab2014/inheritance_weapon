/**
 * Created by PoChuan for NTUST MITLAB summer training program.
 */

public abstract class Weapon {	
	public Weapon() {
		System.out.println("Weapon()");
	}
	
	public abstract void attack();
	protected abstract int getATK();
	protected abstract int getSpeed();
	
	public void showProperty() {
		System.out.println("Weapon.showProperty(): " +
				"[ATK: " + getATK() + ", getSpeed(): " + 
				getSpeed() + "]");
	}
}
