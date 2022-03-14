import coffeemaker.CoffeeMaker;
import coffeemaker.CoffeeMakerController;
import coffeemaker.CoffeeMakerView;

public class App {

    public static void main(String[] args) {

        CoffeeMaker model = new CoffeeMaker();
        CoffeeMakerView view = new CoffeeMakerView(model);
        CoffeeMakerController controller = new CoffeeMakerController(model, view);
        controller.startMachine();

    }
}
