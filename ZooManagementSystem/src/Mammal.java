
abstract public class Mammal extends Animal {

	public Mammal(String id , String name , int age , double weight , String zone , String type)
	{
		super(id, name, age, weight, zone, "Mammal");
	}
}

 class Lion extends Mammal
 {

	public Lion(String id, String name, int age, double weight, String zone, String type) {
		super(id, name, age, weight, zone, type);
	}
	
	public String getSound() {
		return "roar";
	}
 }
	
 class Tiger extends Mammal
 {

	public Tiger(String id, String name, int age, double weight, String zone,String type) {
			super(id, name, age, weight, zone, type);
	}
	public String getSound() {
		return "ttt";
	}
}
			
 class Deer extends Mammal
 {

	public Deer(String id, String name, int age, double weight, String zone,String type) {
			super(id, name, age, weight, zone, type);
	}	
	public String getSound() {
		return "ddd";
	}
 }
