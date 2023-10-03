package SSG.DimensionalArrays;

import java.util.Arrays;

public class Questions03 {
    public static void main(String[] args) {
          /*
        soru 6) bir multi-dimensional array olusturun ve
        outer indexlerin inner indexlerini tek tek kontrol edip
        en buyuk degerlerini yazdırın
         */
        int sayilar[][]={{57,8,37},{99,88,11},{32,34,15,12},{2,3,5,1}};
        for (int [] w :sayilar ) {
            Arrays.sort(w);
            System.out.println(w[w.length - 1]);


        }



    }
}
