/**
Class for defining a cat in a virtual pet simulator.
*/
public class Cat extends Pet {
	/**
	Constructor for Cat. Uses the Super constructor from Pet to set
	the name of the Cat
	@param name the name of the cat
	*/
    public Cat(String name) {
        super(name);
    }

	/**
	Prints the name of the cat followed by "says: Meow!"
	*/
    public void meow() {
        System.out.println(getName() + " says: Meow!");
    }
	public void purr() {
		System.out.println(getName() + " purrs loudly.");
	}
	public void pounce(boolean stalking) {
		if (stalking) {
			System.out.println("...");
			System.out.println(getName() + " pounced!");
		} else {
			System.out.println(getName() + " isn't stalking.");
		}
	}
	public void stalk(Dog dog) {
		if (dog == null) {
			pounce(false);
		} else {
			System.out.println(getName() + " is stalking " + dog.getName());
			pounce(true);
		}

	}
}
