import io.Console;
import models.Whiskey;
import services.SneakerService;
import services.WhiskeyService;

public class App {
    private SneakerService sneakerService = new SneakerService();
    private WhiskeyService whiskeyService = new WhiskeyService();

    public static void main(String... args) {
        App application = new App();
        application.init();
    }

    public void init() {
        Console.printWelcome();

//        Create different products to be added to inventory
//        Read from existing products
//        Update products
//        Delete products
//        Get different reports about products
//        Exit the program
    }
}
