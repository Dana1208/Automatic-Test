import static org.junit.jupiter.api.Assertions.*;

class PutTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(2,new Put().add(1,1));

    }

    private void assertEquals(int i, int add) {
    }

}