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
}