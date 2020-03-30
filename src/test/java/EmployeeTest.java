import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp(){
        employee = new Employee("Paul", "XX000000X", 25000) {
        };
    }

    @Test
    public void canGetName(){
        assertEquals("Paul", employee.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("XX000000X", employee.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, employee.getSalary(), 0.0);
    }

    @Test
    public void canGetAPayRise(){
        assertEquals(25025.75, employee.raiseSalary(25.75),0.0);
    }

    @Test
    public void canGetABonus(){
        assertEquals(25250, employee.payBonus(), 0.0);
    }

}
