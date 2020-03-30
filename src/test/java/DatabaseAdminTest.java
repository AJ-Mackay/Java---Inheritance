import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Rob", "DE654321F", 64000);
    }

    @Test
    public void canGetName(){
        assertEquals("Rob", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("DE654321F", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(64000, databaseAdmin.getSalary(),0.0);
    }

    @Test
    public void canGetAPayRise(){
        assertEquals(64025.75, databaseAdmin.raiseSalary(25.75), 0.0);
    }

    @Test
    public void canGetABonus(){
        assertEquals(64640, databaseAdmin.payBonus(),0.0);
    }
}
