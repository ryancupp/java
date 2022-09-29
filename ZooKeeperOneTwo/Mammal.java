public class Mammal {
	
	private int energyLevel = 100;
	
	public Mammal(){}

	//methods
	public int displayEnergy() {
		System.out.println("Energy Level:" + this.getEnergyLevel());
		return this.getEnergyLevel();		
	}

	
	//getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}