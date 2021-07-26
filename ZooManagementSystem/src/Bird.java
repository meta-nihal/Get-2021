
abstract public class Bird extends Animal{
 
	public Bird(String id , String name , int age , double weight , String zone , String type)
	{
		super(id, name, age, weight, zone, "Bird");
	}
	
}

 class Peacock extends Bird
 {

	public Peacock(String id, String name, int age, double weight,String zone, String type) {
		super(id, name, age, weight,zone, type);
	}
	
	public String getSound()
	{
		return "xxx";
	}
 }
	
 class Parrot extends Bird
 {

	public Parrot(String id, String name, int age, double weight, String zone,String type) {
			super(id, name, age, weight, zone, type);
	}
	
	public String getSound()
	{
		return "yyy";
	}
}
			
 class Pigeon extends Bird
 {

	public Pigeon(String id, String name, int age, double weight, String zone,String type) {
			super(id, name, age, weight, zone, type);
	}	 
	
	public String getSound()
	{
		return "zzz";
	}
 }
				 
 