import java.util.GregorianCalendar;

public class CalendarProject {
    public static void main (String[] args) {
        GregorianCalendar curtime = new GregorianCalendar();
        GregorianCalendar bDay = new GregorianCalendar(1998, GregorianCalendar.NOVEMBER, 30);
        
        System.out.println("The months start at 0 \n");
        
        System.out.println(
            "Current Date: " +
            curtime.get(GregorianCalendar.MONTH) + "/" +
            curtime.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
            curtime.get(GregorianCalendar.YEAR)
        );
        curtime.add(GregorianCalendar.DAY_OF_MONTH, 100);
        System.out.println(
            "100 Days Later: " +
            curtime.get(GregorianCalendar.MONTH) + "/" +
            curtime.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
            curtime.get(GregorianCalendar.YEAR)
        );
           
        System.out.println(
            "Weekday of my Birthday: " + 
            bDay.get(GregorianCalendar.DAY_OF_WEEK)
        );
        bDay.add(GregorianCalendar.DAY_OF_MONTH, 10000);
        System.out.println(
            "10,000 Days from my Birthday: " +
            bDay.get(GregorianCalendar.MONTH) + "/" +
            bDay.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
            bDay.get(GregorianCalendar.YEAR)
        );
    }
}