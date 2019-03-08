import java.util.Scanner;

public class MainState extends State{

    private static final MainState MainStateInstance = new MainState();

    private MainState() {}

    public static MainState getInstance()
    {
        return MainStateInstance;
    }




    @Override
    public void init() {
        System.out.println("\n\nMainState init");
        System.out.println("MAIN STATE");
        System.out.println("Running application......");
        System.out.println("Enter one of the following:");
        System.out.println("\t1: (m) to go to menu state");
        System.out.println("\t2: (q) to quit application");
    }

    @Override
    public void pause() {
        System.out.println("MainState is paused");
    }

    @Override
    public void resume() {
        System.out.println("MainState is resumed");
    }

    @Override
    public void handleEvents(StateManager stateManager) {

        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);

        switch(c)
        {
            // goes to next state
            case 'm':
                stateManager.pushState(MenuState.getInstance());
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
