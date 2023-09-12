package mentoringquestions.Manav;

import java.util.HashMap;

public class Fis {

    public int ucret;
    public int kg;
    public  int sebzeNo;
    public double toplamTutar;

    public void sebzeHesaplama(){
        HashMap<String,Double> sebzeler =new HashMap<>();
        sebzeler.put("Domates",2.1);
        sebzeler.put("Patates",3.2);
        sebzeler.put("Biber",1.5);
        sebzeler.put("Soğan",2.3);
        sebzeler.put("Havuç",3.1);
        sebzeler.put("Elma",1.2);
        sebzeler.put("Muz",1.9);
        sebzeler.put("Çilek",6.1);
        sebzeler.put("Kavun",4.3);
        sebzeler.put("Üzüm",2.7);
        sebzeler.put("Limon",0.5);


        switch (this.sebzeNo){
            case 0:
                this.toplamTutar=sebzeler.get("Domates")*this.kg;break;
            case 1:
                this.toplamTutar=sebzeler.get("Patates")*this.kg;break;
            case 2:
                this.toplamTutar=sebzeler.get("Biber")*this.kg;break;
            case 3:
                this.toplamTutar=sebzeler.get("Soğan")*this.kg;break;
            case 4:
                this.toplamTutar=sebzeler.get("Havuç")*this.kg;break;
            case 5:
                this.toplamTutar=sebzeler.get("Elma")*this.kg;break;
            case 6:
                this.toplamTutar=sebzeler.get("Muz")*this.kg;break;
            case 7:
                this.toplamTutar=sebzeler.get("Çilek")*this.kg;break;
            case 8:
                this.toplamTutar=sebzeler.get("Kavun")*this.kg;break;
            case 9:
                this.toplamTutar=sebzeler.get("Üzüm")*this.kg;break;
            case 10:
                this.toplamTutar=sebzeler.get("Limon")*this.kg;

        }

    }
    public void printFis(int ucret ){
        System.out.println("***********FİŞ************");
        System.out.println("Ödediğiniz ücret       : "+this.ucret+" TL");
        System.out.println("Ödemeniz gereken ücret : "+this.toplamTutar+" TL");
        System.out.println("Para üstünüz           : "+(this.ucret-this.toplamTutar+" TL"));
        System.out.println("Aldığınız miktar       : "+this.kg+" KG");




    }


}
