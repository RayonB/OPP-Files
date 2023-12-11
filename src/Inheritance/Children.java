package Inheritance;

public class Children extends Parent {
    Children(String name){
        super(name);
    }
    
    void dance(){
        System.out.println(name + " kay ganahan kaayo ug sayaw ");
    }
    
    void clean(){
        System.out.println(name + " kay habbies niya pag naa sa balay. ");
    }
}
