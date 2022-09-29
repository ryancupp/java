public class Gorilla extends Mammal{

	public Gorilla() {}
	
	//methods
	public void throwSomething() {
		System.out.println("Throws thing... - 5");
		super.setEnergyLevel(getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println("Eating banana... + 10");
		super.setEnergyLevel(getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("Climbing... - 10");
		super.setEnergyLevel(getEnergyLevel() - 10);
	}
	

}