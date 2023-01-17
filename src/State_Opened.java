public class State_Opened extends State {
    @Override
    public void open(Program program) {}

    @Override
    public void turn(Program program) { program.state = new State_Turned(); }

    @Override
    public void close(Program program) { program.state = new State_Closed(); }

    @Override
    public boolean isOpened() { return true; }

    @Override
    public boolean isTurned() {
        return false;
    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public String doThis() {
        String string = "Program is opened";
        System.out.println(string);
        return string;
    }
}
