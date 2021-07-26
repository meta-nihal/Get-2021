
public class ReptileZone extends Zone {

	ReptileZone(String animalType, int cageCapacity) {
		super(animalType, animalType, cageCapacity);
		// TODO Auto-generated constructor stub
	}
	public boolean hasPark()
	{
		
		return false;
	}
	public boolean hasCanteen()
	{
		
		return false;
	}
	public boolean hasLake()
	{
		
		return true;
	}
	
}
