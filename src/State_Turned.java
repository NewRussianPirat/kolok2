public class State_Turned extends State {
    @Override
    public void open(Program program) { program.state = new State_Opened(); }

    @Override
    public void turn(Program program) {}

    @Override
    public void close(Program program) { program.state = new State_Closed(); }

    @Override
    public boolean isOpened() { return false; }

    @Override
    public boolean isTurned() { return true; }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public String doThis() {
        String string = "Program is turned";
        System.out.println(string);
        return string;
    }
}
