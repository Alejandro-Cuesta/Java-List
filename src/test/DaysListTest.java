import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DaysListTest {
    
    private DaysList daylist;

    @BeforeEach
    public void setup() {
        daysList = new DaysList(); // crea nueva instancia antes de cada test
    } 

    @Test 
    public void test createDayList() {
        daylist.createDayList();

        assertNotNull(daysList.getDays());
    }

    @Test
    public void testGetDaysList(){
        daylist.createDayList();
        List<String> days = daysList.getDays();

        assertNotNull(days);
        assertTrue(days.contains("Lunes"));
    } 

    @Test
    public void testGetDaysCount(){
        daylist.createDayList();
        int count = daysList.getDaysCount();
        
        assertEquals(7, count); 
    }

    
}
