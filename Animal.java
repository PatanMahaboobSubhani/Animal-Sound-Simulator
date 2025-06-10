//1. Base Class: Animal
public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

//2. Subclass: Dog
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// 3. Subclass: Cat
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

//4. Subclass: Cow
public class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}

//5. Simulator with Polymorphism
import java.util.ArrayList;
import java.util.List;

public class AnimalSoundSimulator {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animal : animals) {
            animal.makeSound(); // Dynamic method dispatch
        }
    }
}
