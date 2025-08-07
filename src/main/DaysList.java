import java.util.ArrayList;

public class DaysList {
    private List<String> days;

    public DayList () {
        this.days = new ArrayList<>() 
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
}
 