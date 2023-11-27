package Interface;
public class Main {
    public static void main(String[] args){
        
        Interface_coffee my_coffee = new Interface_coffee();
        my_coffee.affortable();
    
        Interface_Drinks my_drinks = new Interface_Drinks ();
        my_drinks.mapalit();
        my_drinks.lami();
        my_drinks.bugnaw();
    
        Interface_water my_water = new Interface_water();
        my_water.affortable();
    }
}