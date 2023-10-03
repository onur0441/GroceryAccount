package SSG.DataTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter1 {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm:hh a");
        LocalTime saat =LocalTime.of(15,20);
        System.out.println(dtf.format(saat));


    }
}
