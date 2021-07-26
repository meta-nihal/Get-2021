import java.util.*;
public class Cage {

	static int animalCapacity;
	String animalType;
	static Map<String, Animal> animals;
	
	/*
	 * it is used to initialize the cage
	 * @param animalType1 type of animal this cage will support
	 * @param animalCapacity maximum number of animals this cage can hold
	 */
	Cage(String animalType1,int animalCapacity1)
	{
		animalType=animalType1;
		animalCapacity=animalCapacity1;
		animals = new HashMap<String,Animal>();
	}
	
	/*
	 * this method calculates the capacity of animal by the cage
	 * @return the capacity
	 */
	int getAnimalCapacity()
	{
		return animalCapacity;
	}
	
	/*
	 * this method finds the animal type
	 * @return animal type 
	 */
	String getAnimalType()
	{
		return animalType;
	}
	
	/*
	 * it is used to add animal in the cage
	 * @param id of the animal
	 * @param animal 
	 */
	static boolean addAnimal(String id,Animal animal)
	{
		String animalType=animal.getClass().getSimpleName();
		
		if(animalType.equals(animalType) && animals.size() < animalCapacity)
		{
			animals.put(id,animal);
			return true;
		}
	    
		return false;
	}
	
	/*
	 * this method whether animal is present in the cage
	 * @param id of the animal
	 * @return true if animal is present or otherwise
	 */
	boolean containsAnimal(String id)
	{
		return animals.containsKey(id);
	}
	
	/*
	 * it is used to remove an animal with given id from this cage
	 * @param id of animal to be removed
	 * @return true if animal is present and removed otherwise false
	 */
	boolean removeAnimal(String id)
	{
		if(containsAnimal(id))
		{
			animals.remove(id);
			return true;
		}
		
		else
			return false;
	}
	
}
