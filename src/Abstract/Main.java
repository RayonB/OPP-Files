package Abstract;

public class Main {
    public static void main(String[] args){
        
        Abstract_coffee my_coffee = new Abstract_coffee();
        my_coffee.affortable();
        my_coffee.lami();

        Abstract_Drinks my_drinks = new Abstract_Drinks() {
            
        my_drinks.mapalit();
        my_drinks.lami();
        my_drinks.bugnaw();
    
        Abstract_water my_water = new Abstract_water();
        my_water.affortable();
    }
}

