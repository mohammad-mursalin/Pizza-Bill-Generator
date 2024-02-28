public class Main {

    public static void main(String[] args) {
        
        Pizza pizza = new Pizza(true);

        pizza.addExtraChese();
        pizza.addExtraTopping();
        pizza.addPack();

        pizza.getPrice();

        DiluxPizza dp = new DiluxPizza(false);

        dp.getPrice();
    }
}