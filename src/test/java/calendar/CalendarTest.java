package calendar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    @Test
    void add() {
        assertEquals(11, new Calendar().add(5, 6));
    }

    @Test
    void subtract() {
        assertEquals(11, new Calendar().subtract(22, 11));
    }
}