public class Program {
    public State state;

    Program() {
        state = new State_Opened();
    }

    Program(State state1) {
        state = state1;
    }

    public void turn() { state.turn(this); }

    public void open() { state.open(this); }

    public void close() { state.close(this); }

    public boolean isOpened() {
        return state.isOpened();
    }

    public boolean isClosed() {
        return state.isClosed();
    }

    public boolean isTurned() { return state.isTurned(); }

    public void Do() {
        state.doThis();
    }
}
