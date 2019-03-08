import java.io.IOException;
import java.util.Scanner;

public class IntroState extends State {


    private static final IntroState IntroStateInstance = new IntroState();

    private IntroState() {}

    public static IntroState getInstance()
    {
        return IntroStateInstance;
    }

    @Override
    public void init() {
        System.out.println("\n\nIntroState init");
        System.out.println("INTRO STATE");
        System.out.println("Enter one of the following:");
        System.out.println("\t1: (w) to begin application");
        System.out.println("\t2: (q) to quit application");
    }

    @Override
    public void pause() {
        System.out.println("IntroState pause");
    }

    @Override
    public void resume() {
        System.out.println("IntroState resume");
    }


    @Override
    public void handleEvents(StateManager stateManager)
    {

        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);

        switch(c)
        {
            // goes to next state
            case 'w':
                stateManager.changeState(MainState.getInstance());
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
    public void update(StateManager stateManager)
    {

    }


}
