package animals;
// runner class
public class AnimalTest {
    public static void main(String[] args) {
        //animal object
        Animal generalAnimal= new Animal();
        generalAnimal.makeSound();

        //cat object
        Cat myCat= new Cat();
        myCat.makeSound();

        //dog object
        Dog myDog= new Dog();
        myDog.makeSound();
    }
}
