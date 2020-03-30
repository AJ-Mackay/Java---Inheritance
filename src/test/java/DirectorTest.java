import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Linda","QW098765T",75000,1000000,"Upper-Level Management");
    }

    @Test
    public void canGetName(){
        assertEquals("Linda", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("QW098765T", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(75000, director.getSalary(), 0.0);
    }

    @Test
    public void canGetBudget(){
     assertEquals(1000000, director.getBudget(),0.0);
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("Upper-Level Management", director.getDeptName());
    }

    @Test
    public void canGetAPayRaise(){
        assertEquals(75025.75, director.raiseSalary(25.75), 0.0);
    }

    @Test
    public void canGetABonus(){
        assertEquals(75750, director.payBonus(),0.0);
    }

}
