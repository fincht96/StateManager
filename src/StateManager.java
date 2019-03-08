import java.util.ArrayList;

public class StateManager {

    public void init()
    {

    }

    public void changeState(State state)
    {
        // if array not empty, cleanup and remove last state from end of array
        if(!states.isEmpty())
        {
            states.remove(states.size() - 1);
        }

        // push the new state to the end of the array and initialise
        states.add(state);
        states.get(states.size()-1).init();
    }


    public void pushState(State state)
    {
        // pauses current state at the end of the array
        if(!states.isEmpty())
        {
            states.get(states.size()-1).pause();
        }

        // push the new state to the end of the array and initialise
        states.add(state);
        states.get(states.size()-1).init();
    }

    public void popState()
    {
        // if array not empty, cleanup and remove last state from end of array
        if(!states.isEmpty())
        {
            states.remove(states.size() - 1);
        }

        // resume previous state
        if(!states.isEmpty())
        {
            states.get(states.size()-1).resume();
        }
    }


    public void handleEvents()
    {
        // calls handleEvents on the state on top of stack
        states.get(states.size()-1).handleEvents(this);
    }

    public void update()
    {
        // calls update on the state on top of stack
        states.get(states.size()-1).update(this);
    }


    public boolean running() {return mRunning;}

    public void quit() {mRunning = false;}


    private ArrayList<State> states = new ArrayList<>();        // holds a dynamic array of states
    private boolean mRunning = true;        // state of application

}
