public class Dog {
	
	String name;
	boolean isHungry = true;

	public Dog(String name){
		this.name = name;
	}

	public void bark(){
		System.out.println("Woof!");
	}

	public void eat(){
		isHungry = false;
	}
}