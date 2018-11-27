package weird.zoo;

    public class Animal {
        private String name;
        private int numberOfLegs;
        private int numberOfWings;


        Animal(String name){
            this.name = name;
            setNumberOfLegs(4);
            setNumberOfWings(0);
        }



        public void fly(){
            System.out.println(this.name + " cannot fly!");
        }
        public void run(){
            System.out.println(this.name+ " is running!");
        }
        public void talk(){
            System.out.println("Silence");
        }




        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfLegs() {
            return numberOfLegs;
        }

        public void setNumberOfLegs(int numberOfLegs) {
            this.numberOfLegs = numberOfLegs;
        }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }
}

