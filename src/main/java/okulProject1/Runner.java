package okulProject1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Teacher.feykOgretmenEkle();
        anamenu();



    }

    public static void anamenu() {
        Scanner input =new Scanner(System.in);
        System.out.println("------ADIGÜZEL KOLEJİNE HOŞ GELDİNİZ------");
        String select ="";
        do {

            System.out.println("          -------ANA MENÜ-------");
            System.out.println("1-Okul Bilgilerini Görüntüle\n2-Öğretmen Menü\n3-Öğrenci Menü\nQ-ÇIKIŞ");
           select =input.nextLine();

           switch (select){
               case "1":
                   School.okulBilgileriniGoruntule();
                   break;
               case "2":
                   Teacher.ogretmenMenu();

                   break;

               case "3":

                   break;
               case "q":
               case "Q":
                  finish();
                   break;
               default:
                   System.out.println("Lütfen geçerli bir değer giriniz");

           }


        }while (!select.equalsIgnoreCase("q"));





    }
    public static void finish (){
        System.out.println("------İYİ GÜNLER DİLERİZ------");
        System.exit(0);


    }
}
