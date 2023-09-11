package SSG.SSG.smallstudygrouplessonsArrayList;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {

        /*
        bir doğal sayı listesi oluşturun ve oluşturduğunuz listteki çift öğeleri toplayın
         */
        ArrayList<Integer> list =new ArrayList<>();
        list.add(9);
        list.add(25);
        list.add(14);
        list.add(41);
        list.add(99);
        list.add(86);
        int sum =0;
        for (Integer w :list ) {
            if (w %2 ==0){
                sum+=w;
            }

        }
        System.out.println("Çiftlerin toplamı = "+sum );
    }
}
