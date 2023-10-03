package RestaurantBillGenerator;

import java.util.Scanner;

public class RestaurantBillGenerator {
    /*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı
       yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsü gösterme, sipariş oluşturma/iptal ve hesap
         oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
         Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/
    public static void main(String[] args) {
        getSelectionMenu();

    }

    public static void getSelectionMenu() {
        DishService dishService =new DishService();


        Scanner input =new Scanner(System.in);
        int select=-1;
        while (select!=0){
            System.out.println("--------------ADIGÜZEL RESTAURANT---------------");
            System.out.println("Menü için 1'e basınız");
            System.out.println("Sipariş girmek için 2'ye basınız ");
            System.out.println("Sipariş iptal etmek için 3'e basınız");
            System.out.println("Hesap oluşturmak için 4'e basınız");
            System.out.println("Çıkış için 0'a basınız");
            select =input.nextInt();

            switch (select){
                case 1:
                    dishService.showMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("------İYİ GÜNLER------");
                    break;






            }
        }






    }
}
