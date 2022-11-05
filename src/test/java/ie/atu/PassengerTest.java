package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    public void title() {
        assertEquals("MR", Passenger.titleCheck("MR"));
        assertEquals("MRS", Passenger.titleCheck("Mster"));
    }


    @AfterEach
    void tearDown() {
    }


    public String getTitle(String title) {

        return title;
    }


}

//Use getters and setters in the test class and pass through the values to the main constructor