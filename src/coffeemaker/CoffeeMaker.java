package coffeemaker;

import drinks.Drink;

public class CoffeeMaker {

    private Drink drink;

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void makeOrder() {
        drink.makeDrink();
    }


}
