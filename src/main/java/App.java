import io.Console;
import models.Whiskey;
import services.Service;
import services.SneakerService;
import services.WhiskeyService;

public class App {
    private SneakerService sneakerService = new SneakerService();
    private WhiskeyService whiskeyService = new WhiskeyService();
    private Console console = new Console();

    public static void main(String... args) {
        App application = new App();
        application.init();
    }

    public void init() {
        console.printWelcome();
        console.printCommands();
        String input = "", current = "Sneaker";
        while (!input.equalsIgnoreCase("Exit")) {
            input = console.getStringInput("What would you like to do? (You are currently looking at %s inventory)",
                    current);
            if (input.equalsIgnoreCase("Switch")) {
                if (current.equalsIgnoreCase("Sneaker")) {
                    current = "Whiskey";
                } else
                    current = "Sneaker";
            } else if (input.equalsIgnoreCase("Add")) {
                productBuilderPager(current);
            } else {
                if (current.equals("Whiskey")) {
                    inventoryOption(whiskeyService, input);
                } else
                    inventoryOption(sneakerService, input);
            }
        }
    }

    public void productBuilderPager(String current) {
        if (current.equals("Sneaker"))
            console.sneakerBuilder();
        else
            console.whiskeyBuilder();
    }

    public <T extends Service> void inventoryOption(T services, String input) {
        if (input.equalsIgnoreCase("Read")) {
            services.findProductAll();
        } else if (input.equalsIgnoreCase("Update")) {
            //        Update products
        } else if (input.equalsIgnoreCase("Delete")) {
            int id = console.getIntegerInput("What is the product id for the product you wish to delete?");
            services.deleteProduct(id);
        }
    }
}
