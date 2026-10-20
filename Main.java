/**
Main.java

Functionality for testing Virtual Pet classes
*/
public class Main {
    public static void main(String[] args) {
		// Define starting pets
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Luna");

		// Print information about the pets
        System.out.println("Welcome, Virt. Pet Owner!");
        dog.bark();
        cat.meow();

        dog.feed();
        cat.play();

        dog.showStatus();
        cat.showStatus();

        cat.stalk(dog);
        cat.purr();
    }
    
}
