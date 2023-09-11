package mentoringquestions.Flightticketapp;

public class Ticket {
    public int weight;

    public int type;
    public String city ;
    public double price;

    public void totalTicket(int age){
        double sumprice =0;

        switch (city){
            case "ankara":
              if (this.type == 1){
                  sumprice= 450*this.weight*0.1;
              }else {
                  sumprice= 450*this.weight*0.1*2*0.8;

              }
              break;
            case "izmir":
                if (this.type == 1){
                    sumprice= 550*this.weight*0.1;
                }else {
                    sumprice= 550*this.weight*0.1*2*0.8;

                }break;
                case "antalya":
                if (this.type == 1){
                    sumprice= 650*this.weight*0.1;
                }else {
                    sumprice= 650*this.weight*0.1*2*0.8;

                }
                break;


        }
        if (age<12){
            sumprice =sumprice*0.5;
        } else if (age> 12 && age <24) {
            sumprice =sumprice *0.9;

        } else if (age >= 65) {
            sumprice =sumprice *0.7;

        }
        this.price =sumprice;

    }

    public void printTicket(){
        System.out.println("****************Biletiniz******************");
        System.out.println("Gideceğiniz şehir : "+this.city);
        System.out.println("Kilonuz           : "+this.weight);
        System.out.println("Yolculuk tipiniz  : "+(this.type ==1 ?"Tek yön" : "Çift yön"));
        System.out.println("Bilet ücretiniz   : "+this.price);
        System.out.println("---------------------İyi yolculuklar Dileriz--------------------");




    }




}
