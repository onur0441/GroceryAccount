package SSG.SSG.smallstudygrouplessonsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question1 {
    public static void main(String[] args) {
        /*
        bir list oluşturun ve bu listteki elemanları alfabetik sıraya göre sıralayın
        */
        ArrayList<String> list =new ArrayList<>();

        list.add("Onur");
        list.add("Ahmet");
        list.add("Buse");
        list.add("Emre");
        Collections.sort(list);
        System.out.println(list);




    }
}
