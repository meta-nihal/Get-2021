abstract public class Animal {

	String id;
	String name;
	String type;
	int age;
	double weight;
	String zone;
	
	
	public Animal(String id, String name,int age, double weight, String zone, String type) {
		
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
		this.weight = weight;
		this.zone = zone;
	
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	
	abstract public String getSound();
}
