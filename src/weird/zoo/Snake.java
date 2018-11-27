package weird.zoo;

public class Snake extends wildAnimal {
    private Boolean poison;

    Snake(String name){
        super(name);
        poison = true;
        super.setNumberOfLegs(0);
        super.setNumberOfWings(0);
    }
    @Override
    public void run(){
        System.out.println(super.getName()+" cannot run!");
    }
    public void crowl(){
        System.out.println(super.getName()+" can crowl!");
    }
}
