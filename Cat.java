public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void Voice(){
        System.out.println(name + " have voices: Meong Meong!!");
    }

    public void Climbing(){
        System.out.println(name + " climbing a tree.");
    }
}