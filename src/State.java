public abstract class State {

    public abstract void init();
    public abstract void pause();
    public abstract void resume();


    public abstract void handleEvents(StateManager stateManager);          // used to handle user input
    public abstract void update(StateManager stateManager);                // updates the state

    public final void changeState(StateManager stateManager, State state) {stateManager.changeState(state);}

}
