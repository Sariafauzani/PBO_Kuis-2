public class PolymorphismDemo {
    public static void main(String[] args) {
        // Heterogeneous Collection
        Animal[] zoo = {
            new Cat("Cat"),
            new Dog("Dog"),
            new Bird("Bird")
        };
        // Polymorphic Arguments
        for (Animal animal : zoo){
            animalAction(animal);
        }
    }
    // Polymorphic Arguments dengan metode
    public static void animalAction(Animal animal) {
        animal.Voice();
        // InstanceOf + Object Casting
        if (animal instanceof Cat) {
            ((Cat) animal).Climbing();
        } else if (animal instanceof Dog) {
            ((Dog) animal).BarkingLoudly();;
        } else if (animal instanceof Bird) {
            ((Bird) animal).Fly();
        }
    }
}