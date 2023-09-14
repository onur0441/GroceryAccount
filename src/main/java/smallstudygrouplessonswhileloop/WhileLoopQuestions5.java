package smallstudygrouplessonswhileloop;

import java.util.Random;
import java.util.Scanner;

public class WhileLoopQuestions5 {
    public static void main(String[] args) {
        Random rnd =new Random();
        Scanner input =new Scanner(System.in);
        int sayi = rnd.nextInt(100);
        int tahminsayisi = 0;
        int kullanicisayisi =-1;


        while (kullanicisayisi !=sayi){
            System.out.println("lütfen  [1-100]  arasi bir sayi giriniz ve tahmin hakkınız 5 dir");
            kullanicisayisi =input.nextInt();
            tahminsayisi++;

            if (kullanicisayisi>=1 && kullanicisayisi<=100 ){

                if (kullanicisayisi>sayi){
                    System.out.println("sayiyi küçült");
                }else if (kullanicisayisi<sayi){
                    System.out.println("sayiyi büyüt");
                }
                else  {
                    if (tahminsayisi <=5) {
                        System.out.println("tebrik ederiz "+tahminsayisi+". tahminde buldunuz ve sayi = "+sayi);
                        break;
                    }else {
                        System.out.println("tahmin sayiniz dolmuştur");
                        break;
                    }


                }






            }else {
                System.out.println("lütfen 1-100 arasi sayi giriniz !!!");
            }


        }





    }
}
