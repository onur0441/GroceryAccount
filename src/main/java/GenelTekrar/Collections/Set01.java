package GenelTekrar.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {
        /*
        setler tekrarsız elemanları kıyaslamak için kullanılır


         */

        HashSet<String> hs =new HashSet<>();
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);
       hs.add(null);
        System.out.println(hs);
        hs.add(null);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs =new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(256);
        lhs.add(168);
        lhs.add(19);
        System.out.println(lhs);

        LinkedHashSet<Integer> ls =new LinkedHashSet<>();
        ls.add(313);
        ls.add(19);
        ls.add(17);
        ls.add(11);



        lhs.retainAll(ls);
        System.out.println(lhs);
        System.out.println(ls);

        TreeSet<Character> ts =new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        System.out.println(ts);



    }
}
