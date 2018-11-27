package weird.zoo;

public class wildAnimal extends Animal {
    private String habitat;

    wildAnimal(String name){
        super(name);
        habitat = "Forest";
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

}
