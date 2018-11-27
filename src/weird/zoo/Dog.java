package weird.zoo;

public class Dog extends Pet {
    Dog(String name){
        super(name);
    }
    @Override
    public void talk(){
        System.out.println("Bark!");
    }
    public void walk(){
        System.out.println(super.getName()+ " walked");
    }
}
