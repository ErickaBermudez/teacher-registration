import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Before
    public void setup(){
        Fixtures.deleteAllModels();
    }
    // create new teacher and save it
    @Test
    public void teacherTest() {
        Teacher ericka = new Teacher("Pamela", "Bermúdez", "erickamail");
        ericka.save();
        assertEquals(1, Teacher.count());
        assertEquals(ericka.employeeNumber, 1);
        assertEquals(ericka.firstName, "Pamela");
    }

}