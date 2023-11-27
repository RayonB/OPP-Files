package Polymorphism;

public class Main {
    public static void main(String[] args){
        polymorphism_Drinks my_drinks = new polymorphism_Drinks(" Softdrink ");
        polymorphism_coffee my_coffee = new polymorphism_coffee (" 3in1 ");
        polymorphism_water my_water = new polymorphism_water (" Mineral ");
        
        my_drinks.mapalit();
        my_coffee.init();
        my_water.bugnaw();
        
        System.out.println("---------------------------------------");
        
        my_drinks.affortable();
        my_coffee.affortable();
        my_water.affortable();
    }
}