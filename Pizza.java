public class Pizza {

    private int pizzaPrice;
    private int extraChese = 50;
    private int extraTopping = 100;
    private int vegPrize = 300;
    private int nonVegPrice = 400;
    private int packPrice = 20;
    String bill = "";

    Pizza(Boolean veg) {

        if(veg) {

            pizzaPrice = vegPrize;
            bill += "\n"+"Veg pizza : " + pizzaPrice ; 
        }
        else {

            pizzaPrice = nonVegPrice;
            bill += "\n"+"Non-Veg pizza : " + pizzaPrice ; 
        }
    }

    public void addExtraChese() {

        pizzaPrice +=extraChese;
        bill += "\n"+"Extra chese added : " + extraChese; 
    }

    public void addExtraTopping() {

        pizzaPrice +=extraTopping;
        bill += "\n"+"Extra topping added : " + extraTopping ; 
    }

    public void addPack() {

        pizzaPrice += packPrice;
        bill += "\n"+"Pack price : " + packPrice ; 
    }

    public void getPrice() {

        System.out.println(bill);
        System.out.println("--------------------------------------");
        System.out.println("Total bill : " +pizzaPrice);
        System.out.println("\n");
    }
}