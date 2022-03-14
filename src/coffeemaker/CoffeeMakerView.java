package coffeemaker;

import drinks.Cappuccino;
import drinks.Drink;
import drinks.Espresso;
import drinks.Latte;
import utils.Validator;

import java.util.HashMap;
import java.util.Scanner;

public class CoffeeMakerView {

    CoffeeMaker model;
    int choice;
    Scanner scanner;
    HashMap<Integer, Drink> options = new HashMap<>() {{
        put(1, new Espresso());
        put(2, new Cappuccino());
        put(3, new Latte());
    }};

    public CoffeeMakerView(CoffeeMaker model) {

        this.model = model;
    }

    public void chooseDrink() {

        scanner = new Scanner(System.in);

        System.out.print("""
                --------------------------
                Выберите напиток:
                1 - Эспрессо
                2 - Капучино
                3 - Латте
                """);


        choice = Validator.validateOptionInput(scanner);
        model.setDrink(options.get(choice));

    }

}
