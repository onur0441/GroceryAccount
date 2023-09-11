package biletAPP;

import java.util.Scanner;

public class TicketRezervationApp {
    public static void main(String[] args) {
        /*
Project: Bilet Rezervasyon ve Bilet Fiyatı Hesaplama Uygulaması

    1-Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir
    2- Kullanıcıdan     mesafe (KM),
                        yolcu yaşı ,
                        yolculuk tipi (Tek Yön, Gidiş-Dönüş)
                        ve koltuk no bilgilerini alınır.
             NOT: Koltuk numaraları 1-32 aralığında olmalıdır.)
                  Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
                  Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

    3-Fiyat hesaplama kuralları:
       -Mesafe başına ücret:
                  Tek yön: 1 Lira / km       Çift Yön(Gidiş-Dönüş): 2 Lira/km
       -Tekli Koltuk ücreti:
                  Koltuk no 3 veya 3 ün katı ise fiyat %20 daha fazladır(Tek yön: 1.2 Lira/km, Çift Yön:2.4 Lira/km).
       -İlk olarak seferin mesafe, yön ve koltuk no bilgisine göre fiyatı hesaplanır,
        sonrasında koşullara göre aşağıdaki indirimler uygulanır ;
                   i)-Çift Yön indirimi:
                               "Yolculuk Tipi" gidiş dönüş seçilmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
                   ii)-Yaş indirimi:
                                Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
                                Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

 */
     Bus bus =new Bus("41 KCL 687 ");
     Ticket bilet =new Ticket();
     start(bus,bilet);


    }

    private static void start(Bus bus, Ticket bilet) {
        Scanner input =new Scanner(System.in);
        int select;

        do {
            System.out.println("******************Bilet Rezervasyon Sistemine Hoş Geldiniz********************");
            System.out.println("Lütfen Yaşınızı Giriniz");
            int age = input.nextInt();
            System.out.println("Lütfen Gideceğiniz Mesafe Bilgisini KM olarak Giriniz ");
            int distance = input.nextInt();
            System.out.println("Lütfen yolculuk tipini giriniz");
            System.out.println("Tek Yön İçin 1'e basınız");
            System.out.println("Çift Yön İçin 2'ye basınız");
            int type =input.nextInt();
            System.out.println(bus.seats);
            System.out.println("Lütfen koltuk no giriniz");
            System.out.println("Tekli koltuk ücreti %20 daha fazladır");
            String seat =input.next();
            boolean isReserved =!bus.seats.contains(seat);
            if (isReserved){
                System.out.println("Seçtiğiniz koltuk rezerve edilöiştir");
            }

            if (age >0 && distance >0 && (type == 1 || type == 2) && !isReserved ){
                bus.seats.remove(seat);
                bilet.distance =distance;
                bilet.typeNo =type;
                bilet.seatNo=seat;
                bilet.getTotalPrice(age);
                bilet.printTicket(bus);
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
            System.out.println("Çıkış için 0'a basınız, yeni işlem için herhangi bir sayiya basınız ");
            select =input.nextInt();


        }while (select !=0);
        System.out.println("------------------İyi günler dileriz------------------");



    }

}
