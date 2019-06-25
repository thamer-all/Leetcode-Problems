public class Animels {

    private String name ;
    private double height;
    private int weight;
    private String sound;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){return name;}
    public void setWeight(int newWright){
       if (newWright > 0){
           weight = newWright;
       } else {
           System.out.println("Weight must be bigger than 0");
       }
    }
    public  int getWeight(){return weight;}
}
