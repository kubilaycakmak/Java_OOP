package weird.zoo;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Launcher{
    public String name, kind;
    public int Counter;
    Launcher(){
        try{
            Counter=0;
            String Line;
            Scanner sc = new Scanner(new File("input.txt"));
            /*while(sc.hasNext()){
                sc.nextLine();
                Counter++;
            }*/
            System.out.println("Counter: "+ Counter);
            //sc.reset();
            //System.out.println(sc);
            Animal animals[] = new Animal[8];
            for(int i=0; i<8;i++){
                name = sc.next();
                kind = sc.next();

                if (kind.equals("Bird")){
                    animals[i] = new Bird(name);
                }else if(kind.equals("Cat")){
                    animals[i] = new Cat(name);
                }else if(kind.equals("Dog")){
                    animals[i] = new Dog(name);
                }else if(kind.equals("Eagle")){
                    animals[i] = new Eagle(name);
                }else if(kind.equals("Snake")){
                    animals[i] = new Snake(name);
                }else if(kind.equals("Fish")){
                    animals[i] = new Fish(name);
                }
            }
            animals[0].fly();
            animals[1].run();
            animals[2].talk();
            System.out.println(animals[3].getNumberOfLegs());
            /*for(var i=0; i<animals.length;i++){
                animals[i].fly();
            }*/
        }catch (IOException e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        new Launcher();
    }
}
