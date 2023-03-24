import java.util.*;

public class List {
    private ArrayList<Holiday> holidays = new ArrayList<>();

    public void addHoliday(Holiday holiday) {
        this.holidays.add(holiday);
    }

    public ArrayList<Holiday> getHolidays() {
        return this.holidays;
    }
}
