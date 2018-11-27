package weird.zoo;

public class Fish extends Pet{
    private int waterDegree = 10;

    Fish(String name){
        super(name);
        super.setNumberOfLegs(0);
        super.setNumberOfWings(0);
    }
    @Override
    public void run(){
        System.out.println(super.getName()+ " cannot running!");
    }
    public void swim(){
        System.out.println(super.getName()+ " swimming!");
    }

    public int getWaterDegree() {
        return waterDegree;
    }

    public void setWaterDegree(int waterDegree) {
        this.waterDegree = waterDegree;
    }



}
