
public class BirdZone extends Zone {

	BirdZone(String animalType, int cageCapacity) {
		super(animalType, animalType, cageCapacity);
		
	}
	public boolean hasPark()
	{
		
		return true;
	}
	public boolean hasCanteen()
	{
		
		return true;
	}
	public boolean hasLake()
	{
		
		return false;
	}

}
