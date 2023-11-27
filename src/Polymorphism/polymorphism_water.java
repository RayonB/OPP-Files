package Polymorphism;

public class polymorphism_water extends polymorphism_Drinks{   //child class
    polymorphism_water(String name){
        super(name);
    }
    void gipalit(){
        System.out.println(name + " kay giuhaw siya sa iyang lakaw");
    }    
    public void affortable(){
        System.out.println(" mapalit sa tindahan" + name);
    }
}