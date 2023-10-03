package SSG.DimensionalArrays;

public class Questions05 {
    public static void main(String[] args) {
        /*
        soru 7) Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
         */
        int sayilar[][]={{57,8,37},{99,88,11},{32,34,15,12},{2,3,5,1}};
        double toplam =0;
        double ortalama=0;
        for (int [] w :sayilar ) {
            toplam=0;
            for (int each :w ) {
                toplam+=each;

            }
            ortalama =toplam/ w.length;
            for (int each :w ) {
                if (each >ortalama){
                    System.out.println("ortalamadan büyük elemanlar : "+each);
                }


            }




        }

    }
}
