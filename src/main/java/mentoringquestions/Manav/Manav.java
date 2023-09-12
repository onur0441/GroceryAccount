package mentoringquestions.Manav;

import java.util.HashMap;
import java.util.Scanner;

public class Manav {
    /* Basarili Market alış-veriş programı.
       *
       * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
       *          No     Ürün           Fiyat
                 ====  =======        =========
                  00   Domates         2.10 TL
                  01   Patates         3.20 TL
                  02   Biber           1.50 TL
                  03   Soğan           2.30 TL
                  04   Havuç           3.10 TL
                  05   Elma            1.20 TL
                  06   Muz             1.90 TL
                  07   Çilek           6.10 TL
                  08   Kavun           4.30 TL
                  09   Üzüm            2.70 TL
                  10   Limon           0.50 TL
       * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
       * 3. Adım: Kaç kg satın almak istediğini sorunuz.
       * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
       * 5. Başka bir ürün alıp almak istemediğini sorunuz.
       * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
       * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
       */
    public static void main(String[] args) {
        Fis fis =new Fis();

        Scanner input =new Scanner(System.in);

        int select ;
        boolean secim =true ;
        do {
            System.out.println("------ADIGÜZEL MANAV------");
            System.out.println("Lütfen bir sebze no'su giriniz");
            System.out.println("0)Domates=2.1 ,1)Patates=3.2 ,2)Biber=1.5 ,3)Soğan=2.3 ,4)Havuç=3.1 ,5)Elma=1.2 ,6)Muz=1.9 ,7)Çilek=6.1 ,8)Kavun=4.3 ,9)Üzüm=2.7 ,10)Limon=0.5");
            int sebzeNo =input.nextInt();
            System.out.println("Seçtiğiniz sebzeden kaç KG almak istersiniz");
            int kg =input.nextInt();
            System.out.println("Lütfen ücreti ödeyiniz");
            int ucret =input.nextInt();
            if ((sebzeNo>=0 && sebzeNo<11) && kg>0 && ucret>= fis.toplamTutar){
                fis.kg=kg;
                fis.sebzeNo=sebzeNo;
                fis.ucret=ucret;
                fis.sebzeHesaplama();
                fis.printFis(fis.ucret);
                System.out.println("Devam için 1'e ÇIKIŞ için 1 dışındaki herhangi bir sayıya basınız basınız");
                select =input.nextInt();
                secim = select ==1 ? true :false;

            }
            else {
                System.out.println("lütfen doğru değerler giriniz ");
                System.out.println("Devam için 1'e ÇIKIŞ için 1 dışındaki herhangi bir sayıya basınız basınız");
                select =input.nextInt();
                  secim = select ==1 ? true :false;


            }

        }while (secim);

        System.out.println("------------İYİ GÜNLER------------");


















    }



    }


