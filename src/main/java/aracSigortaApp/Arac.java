package aracSigortaApp;
/*
Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
          -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
 */

import java.util.Scanner;

public class Arac {

   public int prim;
    public String type;

    public  void accountPrim (int donem){
        switch (this.type){
            case "otomobil":
                this.prim = donem== 1 ?2000 :2500;
                break;
            case "kamyon":
                this.prim = donem== 1 ?3000 :3500;
                break;
            case "otobüs":
                busAccount(donem);
                break;

            case "motosiklet":
                this.prim = donem== 1 ?1500 :1750;
                break;
            default:
                System.out.println("Hatalı Giriş !");
                this.prim =0;
                break;


        }


    }
    public void busAccount (int donem){
        Scanner input =new Scanner(System.in);
        System.out.println("Otobüs tipini seçiniz");
        System.out.println("Type 1 için 1'e basınız(18-30 koltuk)");
        System.out.println("Type 2 için 2'ye basınız(31 ve üstü koltuk)");
        int busTip =input.nextInt();
        switch (busTip){
            case 1:
                this.prim =donem ==1 ? 4000 :4500;
                break;
            case 2:
                this.prim =donem ==1 ? 5000 :5500;
                break;
            default:
                System.out.println("Hatalı Giriş ");
                this.prim =0;


        }







    }



}

