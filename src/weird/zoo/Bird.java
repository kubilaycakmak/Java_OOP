package weird.zoo;

public class Bird extends Pet{

    Bird(String name){
        super(name);
        super.setNumberOfLegs(2);
        super.setNumberOfWings(2);
    }
    /*
    public static void main(String args[]){
        Animal animal = new Bird("kiwi");
        animal.fly();
    }*/
    @Override
    public void run(){
        System.out.println(super.getName() + "cannot runing!");
    }
    @Override
    public void talk(){
        System.out.println("Chirp!");
    }
    @Override
    public void fly(){
        System.out.println(super.getName() + " can fly!");
    }
}
