package GenelTekrar.ooppracticeTekrar;

public class Encapsulation {
        /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */
    private String isim;
    private String soyisim ;
    private int yas;


    public Encapsulation(String isim, String soyisim, int yas) {
        if (isim.charAt(0)>'A' && isim.charAt(0)<'Z'){
            this.isim = isim;
        }else System.out.println("Lütfen ismin ilk harfini küçük harf girmeyiniz.");

        this.soyisim = soyisim;
        if (yas > 0) {
            this.yas = yas;
        }else System.out.println("negatif yaş girilemez");

    }

    public Encapsulation() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>0){
            this.yas = yas;
        }else System.out.println("Negatif yaş giremessiniz");

    }

    @Override
    public String toString() {
        return "Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
