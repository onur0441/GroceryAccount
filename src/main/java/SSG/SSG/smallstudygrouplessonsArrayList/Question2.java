package SSG.SSG.smallstudygrouplessonsArrayList;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        /*
        bir doğal sayi listesi oluşturun ve oluşturduğunuz listteki tüm öğeleri toplayın
         */
        ArrayList<Integer> list =new ArrayList<>();
        list.add(0);
        list.add(25);
        list.add(14);
        list.add(41);
        list.add(99);
        int sum =0;
        for ( Integer w:list  ) {
            sum+=w;

        }
        System.out.println("Toplam = "+sum);

    }
}
