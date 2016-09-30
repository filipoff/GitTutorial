public class Dog {
	
	String name;
	boolean isSleepy = true;

	public Dog(String name){
		this.name = name;
	}

	public void bark(){
		System.out.println("Woof!");
	}

	public void sleep(){
		isSleepy = false;
	}
}