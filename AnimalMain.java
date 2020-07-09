abstract class Animal{
	public abstract void makeSound();


}

class Dog extends Animal{
	@Override
	public void makeSound(){
		System.out.println("woof");

	}

}

class Cat extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Meow");

	}


}

class AnimalMain{
	public static void main(String[] args){
		Dog Padfoot =new Dog();
		Padfoot.makeSound();

		Cat Crookshanks = new Cat();
		Crookshanks.makeSound();
}
}


