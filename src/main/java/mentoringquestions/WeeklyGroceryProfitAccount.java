package mentoringquestions;

import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyGroceryProfitAccount {
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */
        Scanner input =new Scanner(System.in);
        ArrayList<String> gunler =new ArrayList<>();
        gunler.add("pazartesi");
        gunler.add("sali");
        gunler.add("carşamba");
        gunler.add("perşembe");
        gunler.add("cuma");
        gunler.add("cumartesi");
        gunler.add("pazar");
        ArrayList<Double> gunlukKazanclar =new ArrayList<>();
        int i=0;
        while (i<gunler.size()){
            System.out.print("lütfen haftanin "+(i+1)+".gününün kazancini giriniz = ");
            double kazanc =input.nextDouble();
            gunlukKazanclar.add(i,kazanc);
            i++;
        }
        double ortalama = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("haftalık ortalama kazanc = "+ortalama);
        System.out.println("ortalamanin üstünde olan kazanc günleri : "+getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, ortalama));
        System.out.println("ortalamanin altında olan kazanc günleri : "+getOrtalamaninAltindaKazancGunleri(gunler, gunlukKazanclar, ortalama));
    }
    private static double getOrtalamaKazanc(ArrayList<Double> gunlukKazanclar){
        double sum =0;
        for (double w : gunlukKazanclar ) {
            sum+=w;
        }
        return   sum/gunlukKazanclar.size();
    }
    private static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList <String> gunler, ArrayList<Double> gunlukKazanclar , double ortalama ){
        ArrayList<String> ortalamaUstGunler =new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) > ortalama){
                ortalamaUstGunler.add(gunler.get(i));
            }
        }
        return ortalamaUstGunler;
    }
    private static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList <String> gunler, ArrayList<Double> gunlukKazanclar , double ortalama){
        ArrayList<String> ortalamaAltGunler =new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) < ortalama){
                ortalamaAltGunler.add(gunler.get(i));
            }
        }
        return ortalamaAltGunler;
    }
    }

