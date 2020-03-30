import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Andrew", "AB666666C", 26500);
    }

    @Test
    public void canGetName(){
        assertEquals("Andrew", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AB666666C", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(26500, developer.getSalary(),0.0);
    }

    @Test
    public void canGetAPayRise(){
        assertEquals(26525.75, developer.raiseSalary(25.75), 0.0);
    }

    @Test
    public void canGetABonus(){
        assertEquals(26765, developer.payBonus(),0.0);
    }
}
