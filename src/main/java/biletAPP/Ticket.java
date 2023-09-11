package biletAPP;

public class Ticket {

    public double distance ;
    public  int typeNo ;

    public String seatNo ;
    public double price ;


    public void getTotalPrice(int  age){
        /*
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
        double total =0;
        int seat =Integer.parseInt(seatNo);
        switch (this.typeNo){
            case 1:
                if (seat % 3 == 0){
                    total =this.distance*1.2;
                }else {
                    total =this.distance*1;
                }
                break;
            case 2:
                if (seat % 3 == 0){
                    total =this.distance*2.4;
                }else {
                    total =this.distance*2;
                }
                total = total*0.8;
                break;

        }
        if (age<12){
            total =total*0.5;
        } else if (age>65) {
            total=total*0.3;
        }
        this.price =total;
    }
    public void   printTicket(Bus bus){
        System.out.println("*".repeat(33));
        System.out.println("----Bilet Detayları----");
        System.out.println("Otobüs Plakası : "+bus.numberPlate);
        System.out.println("Mesafe         : "+this.distance);
        System.out.println("Yolculuk Tipi  : "+(this.typeNo == 1 ? "Tek yön " :"Çift Yön"));
        System.out.println("Koltuk No      : "+this.seatNo );
        System.out.println("Toplam Tutar   : "+this.price);
        System.out.println("-------İyi Günler Dileriz-------");
        System.out.println("*".repeat(33));



    }


}
