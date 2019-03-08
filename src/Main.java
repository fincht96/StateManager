import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        StateManager stateManager = new StateManager();

        stateManager.init();

        // loads the first state
        stateManager.changeState(IntroState.getInstance());

        // main loop
        while(stateManager.running())
        {
            stateManager.handleEvents();
            stateManager.update();
        }




    }
}
