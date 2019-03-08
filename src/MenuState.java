import java.util.Scanner;

public class MenuState extends State {

    private static final MenuState MenuStateInstance = new MenuState();

    private MenuState() {}

    public static MenuState getInstance()
    {
        return MenuStateInstance;
    }



    @Override
    public void init() {
        System.out.println("\n\nMenuState init");
        System.out.println("MENU STATE");
        System.out.println("Enter one of the following:");
        System.out.println("\t1: (b) to exit menu state");
        System.out.println("\t2: (q) to quit application");
    }

    @Override
    public void pause() {
        System.out.println("MenuState pause");
    }

    @Override
    public void resume() {
        System.out.println("MenuState resume");
    }

    @Override
    public void handleEvents(StateManager stateManager) {
        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);

        switch(c)
        {
            // to leave menu state
            case 'b':
                stateManager.popState();
                break;

            // quits the application
            case 'q':
                stateManager.quit();
                break;

            default: System.out.println("Invalid input, try again.");
                return;
        }
    }

    @Override
    public void update(StateManager stateManager) {

    }
}
