import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("-----Encontra-Feriado 2023-----");
        List list = new List();
        Database db = new Database();
        String[] dateArr = db.getDateArr();
        String[] nameArr = db.getNameArr(); 

        for(int i = 0; i < dateArr.length; i++) {
            Holiday holiday = new Holiday();
            holiday.setDate(dateArr[i]);
            holiday.setName(nameArr[i]);
            list.addHoliday(holiday);
        }
        ArrayList<Holiday> holidays = list.getHolidays(); 

        Scanner sc= new Scanner(System.in);
        System.out.println("Insira uma data no formato DD/MM/YYYY- ");
        String date = sc.next();


        for(int i = 0; i < holidays.size(); i++) {
            if(holidays.get(i).getDate().equals(date)) {
                Holiday holiday = holidays.get(i);
                System.out.println(date + " : " + holiday.getName());
                return;
            }
        }
        System.out.println("Essa data não corresponde a um feriado.");
    }
}
