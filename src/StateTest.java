import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @Test
    void turn() {
        Program program = new Program();
        assertFalse(program.isTurned());
        program.turn();
        assertTrue(program.isTurned());
    }

    @Test
    void open() {
        Program program = new Program();
        program.close();
        assertFalse(program.isOpened());
        program.open();
        assertTrue(program.isOpened());
    }

    @Test
    void close() {
        Program program = new Program();
        assertFalse(program.isClosed());
        program.close();
        assertTrue(program.isClosed());
    }

    @Test
    void doThis() {
        State state_opened = new State_Opened();
        State state_turned = new State_Turned();
        State state_closed = new State_Closed();
        assertEquals("Program is opened", state_opened.doThis());
        assertEquals("Program is turned", state_turned.doThis());
        assertEquals("Program is closed", state_closed.doThis());
    }

    @Test
    void isOpened() {
        assertTrue(new State_Opened().isOpened());
        assertFalse(new State_Turned().isOpened());
        assertFalse(new State_Closed().isOpened());
    }

    @Test
    void isTurned() {
        assertFalse(new State_Opened().isTurned());
        assertTrue(new State_Turned().isTurned());
        assertFalse(new State_Closed().isTurned());
    }

    @Test
    void isClosed() {
        assertFalse(new State_Opened().isClosed());
        assertFalse(new State_Turned().isClosed());
        assertTrue(new State_Closed().isClosed());
    }
}