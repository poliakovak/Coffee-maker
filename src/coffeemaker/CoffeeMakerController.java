package coffeemaker;

public class CoffeeMakerController {

    CoffeeMaker model;
    CoffeeMakerView view;

    public CoffeeMakerController(CoffeeMaker model, CoffeeMakerView view) {
        this.model = model;
        this.view = view;
    }

    public void startMachine() {

        view.chooseDrink();
        model.makeOrder();
    }
}
