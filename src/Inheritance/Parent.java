package Inheritance;

public class Parent {
    String name;
    
    Parent(String name){
        this.name = name;
    }
    
    void eat(){
        System.out.println(name + " kay gakaon");
    }
    void sleep(){
        System.out.println(name + " kay natulog");
    }
}
