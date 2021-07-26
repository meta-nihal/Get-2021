
abstract public class Reptile extends Animal{


	public Reptile(String id , String name , int age , double weight , String zone , String type)
	{
		super(id, name, age, weight, zone, "Reptile");
	}
}

 class Snake extends Mammal
 {

	public Snake(String id, String name, int age, double weight, String zone,String type) {
		super(id, name, age, weight, zone,type);
	}
	
	public String getSound()
	{
		return "sss";
	}
 }
	
 class Alligator extends Mammal
 {

	public Alligator(String id, String name, int age, double weight, String zone,String type) {
			super(id, name, age, weight, zone, type);
	}
	public String getSound()
	{
		return "AAA";
	}
}
			
 class Monster extends Mammal
 {

	public Monster(String id, String name, int age, double weight, String zone, String type) {
			super(id, name, age, weight, zone, type);
	}	
	public String getSound()
	{
		return "mmm";
	}
 }

