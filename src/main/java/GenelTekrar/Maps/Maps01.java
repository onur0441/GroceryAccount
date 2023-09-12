package GenelTekrar.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {

        HashMap<String,Integer>countryPopulation =new HashMap<>();
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",30000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Netherland",18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Germany=83000000, Albania=30000000}

        Integer usaPopulation =countryPopulation.get("USA");
        System.out.println(usaPopulation);

            Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);
                Collection<Integer>values =  countryPopulation.values();
        System.out.println(values);
        //örnek: countryPopulation mapindeki ülkelerin nüfuslarının ortalaması nedir?
          Collection<Integer> values1= countryPopulation.values();
          int sum =0;
        for (Integer w :values1  ) {
            sum+=w;


        }
        int ort =sum/values1.size();
        System.out.println(ort);
        Set<Map.Entry<String,Integer>> entries =countryPopulation.entrySet();

        //ornek: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz
        int toplam =0;
        for (Map.Entry<String,Integer> w:entries){
          toplam =toplam + w.getKey().length()+w.getValue();



        }
        System.out.println(toplam);








    }
}
