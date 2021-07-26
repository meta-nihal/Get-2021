import java.util.Scanner;
import java.util.HashMap;

public class ZMS {
	
	static Animal animal;
    static Scanner sc = new Scanner(System.in);
    int zoneCapacity;
    static HashMap<String,Zone> zones;
    static int animalId=0;
    
    /*
     * constructor to initialize zoneCapacity
     * @param zoneCapacity maximum number of zones possible
     */
    public ZMS(int zoneCapacity)
	{
		this.zoneCapacity=zoneCapacity;
		zones=new HashMap<String,Zone>();
	}
    
    /*
     * this method adds zone to the zoo
     * @param id of the zone to be added to zoo
     * @param category of the animal in the zone
     * @param capacity of the zone to hold the cages
     * @return true if cage is successfully added else return false
     */
    public boolean addZone(String zoneId,String animalCategory, int cageCapacity)
    {
    	if(!zones.containsKey(zoneId) && zones.size()<zoneCapacity)
    	{
    		Zone zone = new Zone(zoneId,animalCategory,cageCapacity);
    		zones.put(zoneId,zone);
    		return true;
    	}
    	return false;
    }
    
    /*
     * this method adds cage to the zoo
     * @param animalCategory category of animal cage can hold
     * @param animalType type of animal cage has
     * @param animalCapacity capacity of the cage
     * @return true if cage is successfully added else false
     */
    public static boolean addCage(String animalCategory,String animalType,int animalCapacity)
    {
    	for(Zone zone : zones.values()) {
    		if(zone.addCage(animalCategory,animalType,animalCapacity))
    			return true;
    	}
    	
    	return false;
    }
    
    /*
     * this method gives the zone of the animal
     */
    private static String zone() {
		// TODO Auto-generated method stub
		return null;
	}

    /*
     * this method gives the id of the animal of particular type
     * @param type of the animal
     * @return id of the animal
     */
   private static String id(String type) {
		
		animalId+=1;
		return animalId+type;
	}

    /*
     * this method allow user to enter the weight of the animal
     * @return the weight of animal
     */
	private static double weight() {
		
		System.out.println("Enter the weight of animal : ");
		return sc.nextDouble();
	}
    
	/*
     * this method allow user to enter the name of the animal
     * @return the name of animal
     */
	private static String name() {
	
		System.out.println("Enter name of animal : ");
		return sc.next();
	}

	/*
     * this method allow user to enter the age of the animal
     * @return the age of animal
     */
	private static int age() {
		
		System.out.println("Enter age of animal : ");
		return sc.nextInt();
	}

	/*
	 * this method is used to remove the particular animal from the zoo in case it has died
	 */
	private static void deleteAnimal() {

		
	}
   
	/*
	 * this method calculates the total animal in the zoo
	 */
	private static void calculateTotalAnimal() {
	  System.out.println(animalId);
	}
    
    /*
     *this method adds animal in the zoo after asking the type of animal to the user 
     */
	private static void addAnimal() {
		
		System.out.print("Enter animal category : \n1. Mammal \n2. Reptile \n3. Bird \n4. back to main case \n");
		int choice;
		do {
			 System.out.print("Enter choice : ");
			 choice =sc.nextInt();
			 switch(choice)
			 {
			    case 1 : getMammal();
			             break;
			             
			    case 2 : getReptile();
			             break;
			          
			    case 3:  getBird();
			             break;
			             
			    case 4 :  return;
			    
			    default : System.out.println("Invalid Animal Type ");                    	 
			 }
		}while(choice!=4);
	}
	
	/*
     *this method adds mammal in the zoo after asking the type of mammal to the user 
     */
	private static void getMammal() {
		
		System.out.println("Select the mammal ");
		System.out.print("1. Lion \n2. Tiger \n3.Deer \n4. Back to addAnimal \n");
		boolean flag=true;
		int choice;
		do {
			System.out.print("Enter your choice :");
		    
			switch(choice=sc.nextInt())
			{
			case 1: animal = new Lion(id("Lion"),name(),age(),weight(),zone(),"Mammal");
			        addCage("mammal","Lion",2);
			        //Cage.addAnimal(id("Lion"),animal);
			        break;
			       
			case 2: animal=new Tiger(id("Tiger"),name(),age(),weight(),zone(),"Mammal");
			        addCage("mammal","Tiger",2);
			        //Cage.addAnimal(id("Tiger"),animal);
	                break;        
			    
			case 3: animal=new Deer(id("Deer"),name(),age(),weight(),zone(),"Mammal");
			        addCage("mammal","Deer",4);
			       // Cage.addAnimal(id("Deer"),animal);
			        break;
			        
			case 4: addAnimal();
			        flag=false;
			        break;
	                
	        default: System.out.println("Invalid choice");
			}
		}while(flag);
		
	}
	
	/*
     *this method adds bird in the zoo after asking the type of bird to the user 
     */
	private static void getBird() {
		System.out.println("Select the bird ");
		System.out.print("1. Peacock \n2. Parrot \n3. Pigeon \n4.back to addAnimal \n");
		boolean flag=true;
		int choice;
		do {
			System.out.print("Enter your choice :");

			switch(choice=sc.nextInt())
			{
			case 1: animal=new Peacock(id("Peacock"),name(),age(),weight(),zone(),"Bird");
			        addCage("bird","Peacock",4);
			        //Cage.addAnimal(id("Peacock"),animal);
			        break;
			       
			case 2: animal=new Parrot(id("Parrot"),name(),age(),weight(),zone(),"Bird");
			        addCage("bird","Parrot",5);
			        //Cage.addAnimal(id("Parrot"),animal);
			        break;        
			    
			case 3: animal=new Pigeon(id("Pigeon"),name(),age(),weight(),zone(),"Bird");
			        addCage("bird","Pigeon",10);
			        //Cage.addAnimal(id("Pigeon"),animal);
			        break;
			        
			case 4: addAnimal();
			        flag=false;
	                break;        
	                
	        default: System.out.println("Invalid choice");
			}
		}while(flag);
		
	}

	/*
     *this method adds reptile in the zoo after asking the type of reptile to the user 
     */
	private static void getReptile() {
 
		System.out.println("Select the reptile ");
		System.out.print("1. Snake \n2. Alligator \n3. Monster \n4. back to addAnimal \n");
		boolean flag=true;
		int choice;
		do {
			System.out.print("Enter your choice :");
			
			switch(choice=sc.nextInt())
			{
			case 1: animal=new Snake(id("Snake"),name(),age(),weight(),zone(),"Reptile");
			        addCage("reptile","Snake",3);
			        //Cage.addAnimal(id("Snake"),animal);
			        break;
			       
			case 2: animal=new Alligator(id("Alligator"),name(),age(),weight(),zone(),"Reptile");
			        addCage("reptile","Alligator",2);
			        //Cage.addAnimal(id("Alligator"),animal);
			        break;        
			    
			case 3: animal=new Monster(id("Monster"),name(),age(),weight(),zone(),"Reptile");
			        addCage("reptile","Monster",1);
			        //Cage.addAnimal(id("Monster"),animal);
			        break;
			        
			case 4: addAnimal();
			        flag=false;
	                break;        
	                
	        default: System.out.println("Invalid choice");
			}
		}while(flag);
		
	}

	
	public static void main(String args[])
	{
		System.out.println("Welcome to ZOO MANAGEMENT SYSTEM");
		System.out.println("Enter number of zones in zoo : ");
		int zone=sc.nextInt();
		String animalCategory;
		int numOfCage;
		ZMS z=new ZMS(10);
		for(int i=0;i<zone;i++)
		{
			System.out.println("Enter animal Category and number of cages ");
			animalCategory=sc.next();
			numOfCage=sc.nextInt();
			z.addZone("Zone"+(i+1)+" ",animalCategory,numOfCage);
			
		}
		int choice;
		do
		{
			System.out.println();
			System.out.print("1. Add animal \n2. Remove animal \n3.Total animal \n4.Exit \n");
			System.out.print("Enter your choice : ");
			choice =sc.nextInt();
			
			switch(choice)
			{
			case 1: addAnimal();
			        break;
			        
			case 2: deleteAnimal();
			        break;
			        
			case 3: calculateTotalAnimal();
			        break;
			        
			case 4: break;
			
			default :System.out.println("Invalid choice");
			}
			
		}while(choice<=3);
		
		
	
	}
}
