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

    public List<String> getDays() { // metodo get nos da los elementos //
        return days;
    }

    public int getSize() { // metodo getSize nos da el tamaño //
        return days.size();
    }

    public boolean removeDays(String days) { // remove borra el elemento que queramos //
        return days.remove(day);
    }

    public String getDay(int index) { // Usamos int index para que el usuario pase la posición del elemento dentro de la lista //
        return days.get(index);
    }

    public boolean containsDay(String day) {
    return days.contains(day); //  El método contains comprueba si un elemento está en la lista //
    }

    public void sortDays() {
    Collections.sort(days); // .sort ordena por orden alfabetico //
    }

    public void clearDays() { // clear vacia la lista //
    days.clear();
    }
}
 