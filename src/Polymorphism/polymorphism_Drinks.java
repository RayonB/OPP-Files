package Polymorphism;

public class polymorphism_Drinks { //parent class
    
    String name;    
    polymorphism_Drinks(String name){
        this.name = name;
    }    
    void mapalit(){
        System.out.println(name + " kay naa sa tindahan  ");
    }    
    void lami(){
        System.out.println(name + " kay swak kaayo sa badget ");
    }    
    void bugnaw(){
        System.out.println(name + " kay giuhaw si jade ");
    }       
    
    public void affortable(){
        System.out.println(" mapalit sa tindahan" + name);
    }
}