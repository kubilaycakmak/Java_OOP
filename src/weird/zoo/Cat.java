package weird.zoo;

public class Cat extends Pet {
    Cat(String name){
        super(name);
    }
    @Override
    public void talk(){
        System.out.println("MEOW!");
    }
    public void cleanHimSelf(){
        System.out.println(super.getName() + " is clean now!");
    }
}
