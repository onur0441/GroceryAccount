package GenelTekrar.Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {
        //example :verilen cümledeki kelimelerin görünüm sayisini veren kodu yaziniz
        //"I like you ,like like!"  => I=1 ,like =3 , you =1

        String str ="I like you ,like like!";
     str = str.replaceAll("\\p{Punct}","");
        System.out.println(str);
        String [] a =  str.split(" ");
        System.out.println(Arrays.toString(a));

        HashMap<String,Integer> occ =new HashMap<>();
        for (String w :a ) {
           Integer b = occ.get(w);
           if (b == null){
               occ.put(w,1);
           }
           else {
               occ.put(w,b+1);
           }

        }
        System.out.println(occ);







    }
}
