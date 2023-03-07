import org.junit.jupiter.api.*;

import java.util.*;

public class BeforeAndAfterTest {

    List<String> names = new ArrayList<>();

    @BeforeEach
    void setUp() {
        names.add("Jaume");
        names.add("Enric");
        names.add("Ken");
        names.add("Lucas");

    }

    @AfterEach
    void tearDown() {
        names = new ArrayList<>();
    }


    @Test
    void shouldAddNameWhenAddIsCalled() {
        names.add("Leandro");
        Assertions.assertEquals("Leandro", names.get(names.size()-1));


    }


    @Test
    void namesLengthShouldBe10() {


        Assertions.assertEquals(4, names.size());

    }


}
