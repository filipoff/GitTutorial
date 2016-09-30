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
	public void printSleepyStatus(){
		System.out.println(isHungry ? "Im sleepy" : "Im NOT sleepy");
	}
}