public class Bird extends Animal {
    public Bird(String name){
        super(name);
    }

    @Override
    public void Voice(){
        System.out.println(name + " have voices: Cuit Cuit!!");
    }

    public void Fly(){
        System.out.println(name + " flying high in the sky.");
    }
}