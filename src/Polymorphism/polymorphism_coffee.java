package Polymorphism;

public class polymorphism_coffee extends polymorphism_Drinks{ //child class
    polymorphism_coffee(String name){
        super(name);
    }
    void init(){
        System.out.println(name + " ang morning routine ni Angel ");
    }
    void favorite(){
        System.out.println(name + " kay gusto kaayo niyang imnon ");
    }

    public void affortable(){
        System.out.println(" mapalit sa tindahan" + name);
   
    }
}
