public class State_Closed extends State {

    @Override
    public void turn(Program program) { program.state = new State_Turned(); }

    @Override
    public void open(Program program) { program.state = new State_Opened(); }

    @Override
    public void close(Program program) {}

    @Override
    public boolean isOpened() { return false; }

    @Override
    public boolean isTurned() { return false; }

    @Override
    public boolean isClosed() { return true; }

    @Override
    public String doThis() {
        String string = "Program is closed";
        System.out.println(string);
        return string;
    }
}
