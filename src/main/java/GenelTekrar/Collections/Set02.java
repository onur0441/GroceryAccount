package GenelTekrar.Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {
        // ogrenci email adreslerini natural order da siralanmış olarak depolayınız
       // 1. yol
      Long t1 = System.nanoTime();
        TreeSet<String> emails =new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails);
        Long t2 = System.nanoTime();

        //2.yol
        HashSet<String>emailsHs =new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("x@gmail.com");
        TreeSet<String> emailsHsTs =new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);
        Long t3 = System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t3-t2);




    }
}
