import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.TestOnly;

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

    @Test 
    public void testRemoveDay() {
        daylist.createDayList();

        asserTrue(daysList.existsDay("Lunes"));

        dayList.removeDay("Lunes");

        assertFalse(dayList.existsDay("Lunes"));
        assertEquals(6, count);
    }

    @Test 
    public void testGetDay() {
        daylist.createDayList();
        String day =dayList.getDay(0);

        assertEquals("Lunes," day);
    }

    @Test
    public void testExistDay() {
        daysList.createDayList();

        asserTrue(daysList.existsDay("Lunes"));
        assertFalse(daysList.existsDay("Fiesta"))
    }
}
