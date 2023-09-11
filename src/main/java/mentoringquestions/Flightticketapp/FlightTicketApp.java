package mentoringquestions.Flightticketapp;

import java.util.Scanner;

public class FlightTicketApp {
    public static void main(String[] args) {
        /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */
        Ticket ticket =new Ticket();


        start(ticket);


    }

  public static void start(Ticket ticket) {
        Scanner input =new Scanner(System.in);
        boolean isAgain =true;

        do {
            int select ;
            System.out.println("----------HOŞGELDİNİZ----------");
            System.out.println("Lütfen gitmek istediğiniz şehri giriniz (ankara ,izmir ,antalya) ");
            ticket.city =input.next();
            System.out.println("Lütfen yaşınızı giriniz : ");
            int age =input.nextInt();
            System.out.println("Lütfen kilonuzu(KG) giriniz :");
            int weight=input.nextInt();
            System.out.println("Lütfen yolculuk tipini giriniz");
            System.out.println("Tek yön için 1'e basınız");
            System.out.println("Çift yön için 2'ye basınız");
            int type =input.nextInt();
            if (age >0 && weight>0 && (type ==1 || type ==2)){
                ticket.weight=weight;
                ticket.type=type;
                ticket.totalTicket(age);
                ticket.printTicket();
            }else {
                System.out.println("Geçersiz bilgiler girdiniz");
            }
            System.out.println("Devam etmek istiyorsanız 1'e basınız, Çıkış için herhangi bir tuşa basınız");
            select =input.nextInt();
                if (select == 1 ) isAgain =true;

                else isAgain=false;

        }while (isAgain);
      System.out.println("...................İyi günler dileriz...................... ");





    }
}
