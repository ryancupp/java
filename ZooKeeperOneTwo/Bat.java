public class Bat extends Mammal{

	public Bat() {
		super.setEnergyLevel(300);
	}

	//methods
	public void fly() {
		System.out.println("Flap flap fly... (-50)");
		super.setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("crunch... (+25)");
		super.setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("Burning flames... (-100)");
		super.setEnergyLevel(getEnergyLevel() - 100);
	}
	
}