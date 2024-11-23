public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void Voice(){
        System.out.println(name + " have voices: Guk Guk!!");
    }

    public void BarkingLoudly(){
        System.out.println(name + " barking loudly!");
    }
}