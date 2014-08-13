/**
 * Created by PoChuan for NTUST MITLAB summer training program.
 */

public class Sword extends Weapon {
	private int atk = 20;
	private int speed = 30;
	
	public Sword() {
		System.out.println("Sword()");
	}
	
	@Override
	public void attack() {
		System.out.println("sword.attack()");
	}
	
	@Override
	protected int getATK() {
		return atk;
	}

	@Override
	protected int getSpeed() {
		return speed;
	}
}
