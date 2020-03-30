import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Colin", "YY123456Y",50000,"Management");
    }

    @Test
    public void canGetName(){
        assertEquals("Colin", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("YY123456Y", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void canGetAPayRaise(){
        assertEquals(50025.75, manager.raiseSalary(25.75), 0.0);
    }

    @Test
    public void canGetABonus(){
        assertEquals(50500, manager.payBonus(),0.0);
    }
}
