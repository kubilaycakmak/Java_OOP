package weird.zoo;

public class Eagle extends wildAnimal {
    Eagle(String name){
        super(name);
        super.setNumberOfLegs(2);
        super.setNumberOfWings(2);
    }
    @Override
    public void fly(){
        System.out.println(super.getName()+ " can fly");
    }
    @Override
    public void run(){
        System.out.println(super.getName()+ " cannot run!");
    }
}
