package GenelTekrar.practiceoop1;

public class Corsa  extends  Opel{
    String hiz ="Corsa arabalar max 200 km hiz yapar";
    String yakit ="Corsa arabalar benzinli veya elektriklidir";

    String model ="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar çevreci motor kullanir");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6lt yakit tüketirler");
    }
    protected void vitesSayisi(){
        System.out.println("Corsalar 5 viteslidir");
    }

    public static void main(String[] args) {
        Corsa arb1 =new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);//Araba
        System.out.println("arb1.hiz = " + arb1.hiz);//Corsa
        System.out.println("arb1.yakit = " + arb1.yakit);//Corsa
        System.out.println("arb1.marka = " + arb1.marka);//Opel
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//Opel
        System.out.println("arb1.model = " + arb1.model);//Corsa
        arb1.motor();//Corsa

        Opel arb2 =new Corsa();
        System.out.println("arb2.hareket = " + arb2.hareket);
        System.out.println("arb2.hiz = " + arb2.hiz);//Opel
        System.out.println("arb2.yakit = " + arb2.yakit);
        System.out.println("arb2.marka = " + arb2.marka);
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);

        arb2.motor();
        arb2.garanti();
        arb2.yakitTuketimi();
       // arb2.vitessayisi() cte
        Araba arb3 =new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket);
        System.out.println("arb3.hiz = " + arb3.hiz);//araba
        System.out.println("arb3.yakit = " + arb3.yakit);
       // arb3.model() cte
        arb3.motor();
        arb3.yakitTuketimi();
         //arb3.garanti  cte
        Araba arb4 =new Opel();
        System.out.println("arb4.hiz = " + arb4.hiz);
        System.out.println("arb4.yakit = " + arb4.yakit);
        arb4.motor();
        arb4.yakitTuketimi();//araba
        //arb4.garanti() cte




    }
}
