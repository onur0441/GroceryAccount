package SSG.SSG.smallstudygrouplessonsArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*
        içinde 200 tane 1000 den küçük tamsayi olan bir list oluşturun
        ve kullanicidan bir sayi isteyip listede var olup olmadığını kullanıcıya yazin
         */
        Scanner input =new Scanner(System.in);
        ArrayList<Integer>list =new ArrayList<>();
        Random random =new Random();
        int sayi=0;

        while (list.size() < 200){
            sayi =random.nextInt(1000);
            if (list.contains(sayi)){
                continue;
            }
            list.add(sayi);
        }

        int tahminhakki =5;
        int tahminsayisi =0;


        do {
            System.out.println("Lütfen bir sayiyi giriniz tahmin hakkınız 5 tir");
          sayi =input.nextInt();
            tahminsayisi++;

            if ( list.contains(sayi)){
                System.out.println("Tebrikler "+tahminsayisi+" tahminde sayiyi buldunuz");
                break;
            }
            else {
                System.out.println("Maalesef sayiniz listede yok");
            }
            tahminhakki--;
            System.out.println("kalan tahmin hakkınız = "+tahminhakki);

        }while (tahminhakki > 0);
        if (tahminhakki ==0 ){
            System.out.println("malesef hakkınız dolmuştur tekrar oyunu başlatın");
        }








    }
}
