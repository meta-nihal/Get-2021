import java.util.ArrayList;
import java.util.List;
public  class Zone {

	public boolean hasPark(){return false;}
	public boolean hasCanteen(){return false;}
	public boolean hasLake(){return false ;}

	
	String animalCategory;
	int cageCapacity;
	List<Cage> cages;
	
	/*
	 * it is used to initialize a zone
	 * @param zoneId of the zone
	 * @param animalCategory takes category of animal by this zone
	 * @param maximum number of capacity the zone can hold 
	 */
	Zone(String zoneId,String animalCategory, int cageCapacity)
	{
		this.animalCategory=animalCategory;
		this.cageCapacity=cageCapacity;
		cages = new ArrayList<Cage>();
	}
	
	/*
     * this method find if the animal id is present in zone
     * @param id id of animal to be searched.
     * @return true if animal with given id is present in this zone and
     * false otherwise.
     */
    boolean containsAnimal(String id) {
        for (Cage cage: cages) {
            if (cage.containsAnimal(id)) {
                return true;
            }
        }
        
        return false;
    }
	/*
	 * this method removes animal from this zone
	 * @param id of animal to be removed
	 * @return true if animal is removed else false
	 */
	boolean removeAnimal(String id)
	{
		for(Cage cage : cages)
		{
			if(cage.removeAnimal(id))
				return true;
		}
		return false;
	}
	
	/*
	 * this method is used to add a cage to this zone.
	 * @param category of animal
	 * @param type of animal
	 * @param capacity of the cage 
	 * @return true if cage is added to this zone else false
	 */
	public boolean addCage( String animalCategory,String animalType, int animalCapacity) {
		
		if(this.animalCategory.equals(animalCategory) && cages.size()<cageCapacity)
		{
			cages.add(new Cage(animalType,animalCapacity));
			return true;
		}
		return false;
	}
}
