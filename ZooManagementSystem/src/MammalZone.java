
public class MammalZone extends Zone {
	
	MammalZone(String animalType, int cageCapacity) {
		super(animalType, animalType, cageCapacity);
		
	}
	public boolean hasPark()
	{
		
		return false;
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
