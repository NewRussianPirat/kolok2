public abstract class State {
    abstract public void turn(Program program);
    abstract public void open(Program program);
    abstract public void close(Program program);
    abstract public boolean isOpened();
    abstract public boolean isTurned();
    abstract public boolean isClosed();
    abstract public String doThis();
}
