package weird.zoo;

public class Pet extends Animal{
        private int costOfFeeding = 0;

        Pet(String name){
            super(name);
        }

        public int getCostOfFeeding() {
            return costOfFeeding;
        }
        public void setCostOfFeeding(int costOfFeeding) {
            this.costOfFeeding = costOfFeeding;
        }
        public void feed(int amount){
            this.costOfFeeding += amount;
            System.out.println("Feeding: "+costOfFeeding);
        }
}
