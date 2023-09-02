package aracSigortaApp;

import java.util.Scanner;

public class AracSigortaApplication {
    /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
         */
    public static void main(String[] args) {
        start();

    }
    public static void start () {
        Scanner input = new Scanner(System.in);
        boolean isAgain;
        do {
            System.out.println("-------------------- Araç Sigorta Prim Hesaplama-----------------------");
            System.out.println("Lütfen  tarife dönemini giriniz");
            System.out.println("Haziran 2023 için 1'e basınız");
            System.out.println("Aralık 2023 için 2'ye basınız");

            int donem = input.nextInt();
            String donemName = donem == 1 ? "Haziran 2023" : "Aralık 2023";
            int select;
            if (donem == 1 || donem == 2) {
                Arac arc = new Arac();
                System.out.println("Lütfen aracınızın type'ini giriniz");
                System.out.println("otomobil, kamyon, otobüs, motosiklet");
                arc.type = input.next();
                arc.accountPrim(donem);
                if (arc.prim > 0) {
                    System.out.println("----------------------------------");
                    System.out.println("Tarife Dönemi : " + donemName);
                    System.out.println("Araç Tipi : " + arc.type);
                    System.out.println("Zorunlu araç sigorta priminiz : " + arc.prim);
                    System.out.println("Tekrar menüye dönmek için 1' basınız ,ÇIKIŞ için 0'a basınız");
                    select = input.nextInt();
                    isAgain = select == 1 ? true : false;


                } else {
                    System.out.println("Hesaplama başarısız");
                    System.out.println("Tekrar menüye dönmek için 1' basınız ,ÇIKIŞ için 0'a basınız");
                    select = input.nextInt();
                    isAgain = select == 1 ? true : false;


                }


            } else {
                System.out.println("Hatalı Giriş!");
                isAgain = true;

            }
        } while (isAgain);
        System.out.println("İyi günler dileriz");


    }

}