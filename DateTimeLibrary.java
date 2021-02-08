import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeLibrary {
    public static void main(String[] args) {
        /**
        LocalTime time = LocalTime.now();
        System.out.println(time);
         **/

        /**
        LocalDate date = LocalDate.now();
        System.out.println(date);
         **/

        //LocalDateTime date_time = LocalDateTime.now();
        //System.out.println(date_time);

        LocalDateTime date_time = LocalDateTime.now();
        System.out.println(date_time);

        //Formatter
        /**
         * Date : dd(digit)
         * Day : E
         * Month : MM(digit)
         * Month : MMM(name)
         * Year : yy
         * Hour : HH
         * Minute : mm
         * Second : ss
         **/

        DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("dd-MM-yy");
        String formatted_date_time1 = date_time.format(dtf1);
        System.out.println(formatted_date_time1);

        /**
        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("Today's date is dd and Month is MM");
        String formatted_date_time2 = date_time.format(dtf2);
        System.out.println(formatted_date_time2);
         This will cause error.Arguement for dtf2is not right
         **/


        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("dd MM,E/yyyy-hh");
        String formatted_date_time2 = date_time.format(dtf2);
        System.out.println(formatted_date_time2);
        /**
         * Other than, the specified paratmeters only gap,comma,dash and slash
         * are allowed
         */
    }
}
