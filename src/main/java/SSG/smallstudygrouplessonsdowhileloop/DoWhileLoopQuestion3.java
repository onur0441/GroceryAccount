package SSG.smallstudygrouplessonsdowhileloop;

import java.util.Scanner;

public class DoWhileLoopQuestion3 {
    public static void main(String[] args) {
        //negatif bir değer girilene kadar kulanicidan girişleri kabul eden
        //ve girilen değerlerden cift sayilari toplayan program yaziniz
        Scanner input =new Scanner(System.in);
        int toplam =0;
        int sayi;

        do {
            System.out.println("lütfen tamsayilari giriniz");
             sayi =input.nextInt();
             if (sayi %2 ==0){
                 toplam+=sayi;

             }


        }while (sayi > 0);
        System.out.println("çift sayilarin toplami = "+toplam);




    }
}
