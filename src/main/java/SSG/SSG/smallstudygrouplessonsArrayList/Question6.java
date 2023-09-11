package SSG.SSG.smallstudygrouplessonsArrayList;

import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {
        //bir listede ortalamanın üstünde olan eleman sayisini bulunuz
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<Integer> newList =new ArrayList<>();
        list.add(25);
        list.add(15);
        list.add(28);
        list.add(44);
        list.add(19);
        list.add(34);
        list.add(6);
        list.add(39);
        double sum =0;
        for (Integer w :list  ) {
            sum =sum +w ;

        }

        double average =sum/list.size();
        System.out.println("Ortalama = "+average);


        for (Integer w :list  ) {
            if (w > average){
                newList.add(w);
            }


        }
        System.out.println(newList);


    }
}
