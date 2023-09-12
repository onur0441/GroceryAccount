package GenelTekrar.Maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String,Integer> stdAges =new HashMap<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Ahmet",41);


        stdAges.put("Tom",35);
        System.out.println(stdAges);

        stdAges.replace("Tom",39);
        System.out.println(stdAges);
        stdAges.replace("Tom",15,41);






    }
}
