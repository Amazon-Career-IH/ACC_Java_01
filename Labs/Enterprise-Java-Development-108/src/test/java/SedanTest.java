import com.ironhack.vehicles.*;
import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

public class SedanTest {

    Sedan sedan;
    Truck truck;
    UtilityVehicle utilityVehicle;

    @BeforeEach
    void setUp() {
        sedan = new Sedan("dfsdf", "Audi", "A3", 1202);

    }

    @AfterEach
    void tearDown() {
        sedan = null;
    }

    @Test
    void shouldCreateASedan() {


    }

    @Test
    void shouldSetterWork() {
        sedan.getInfo();
    }
}
