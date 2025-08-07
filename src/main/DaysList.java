import java.util.ArrayList;
import java.util.List;

public class DaysList {
    private List<String> days;

    public DayList () {
        this.days = new ArrayList<>();
    }

    public void createDayList() {
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
    }

    public List<String> getDays() {
        return days;
    }

    public int getSize() {
        return days.size();
    }

    public boolean removeDays(String days) {
        return days.remove(day);
    }

    public String getDay(int index) {
        return days.get(index);
    }

    public boolean containsDay(String day) {
    return days.contains(day);
    }

    
}
 