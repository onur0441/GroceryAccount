package SSG.DataTime;

import java.time.LocalTime;

public class LocalTime1 {
    public static void main(String[] args) {
        LocalTime saat =LocalTime.now();
        System.out.println(saat);
        System.out.println(saat.getSecond());
        System.out.println(saat.plusSeconds(10000));
        System.out.println(saat.minusMinutes(200));

        System.out.println(saat.withHour(3));


    }
}
