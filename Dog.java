public class Dog {
	
	String name;
	boolean isSleepy = true;
	boolean isHungry = true;

	public Dog(String name){
		this.name = name;
	}

	public void bark(){
		System.out.println("Woof!");
	}

	public void sleep(){
		isSleepy = false;
	public void eat(){
		isHungry = false;
	}

	public void printName(){
		System.out.println(name);	
	}
	public void printHungerStatus(){
		System.out.println(isHungry ? "Im hungry" : "Im NOT hungry");
	}
}