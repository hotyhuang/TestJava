package learn.dota;

public class Hero implements Person, Power {
	public String name;
	int level;
	
	Hero() {
		
	}
	
	public Hero(String name) {
		this.name = name;
		this.level = 1;
	}
	
	public Hero(String name, int level) {
		this.name = name;
		this.level = level;
	}
	
	public void Say() {
		System.out.println("This is in Hero!");
	}
	
	public void superPower() {
		System.out.println("I have super power.");
	}
	
	public void Call() {
		System.out.println("Call void");
	}
	
	void Call(int i) {
		System.out.println("Call int: " + i);
	}
	
	void Call(String aa) {
		System.out.println("Call String: " + aa);
	}
	
	public String toString() {
		return name + " - " + level + " lvl";
	}
}
