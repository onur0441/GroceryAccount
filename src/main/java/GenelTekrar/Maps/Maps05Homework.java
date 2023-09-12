package GenelTekrar.Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps05Homework {
    public static void main(String[] args) {
        //homework
      //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
          //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
        String str ="Hello Henry!";
       str = str.replaceAll("\\p{Punct}","" );
      str = str.replace(" ","");
        System.out.println(str);
       String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        HashMap <String,Integer>hm =new HashMap<>();
        for (String w:arr){
           Integer occ = hm.get(w);
           if (occ == null){
               hm.put(w,1);
           }else {
               hm.replace(w,occ+1);
           }
        }
        System.out.println(hm);




    }
}
