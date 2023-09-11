package GenelTekrar.Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
        Queue<String> depo =new LinkedList<>();
        depo.add("süt");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo);
        depo.remove();
        System.out.println(depo);

        depo.clear();
        System.out.println(depo);
        System.out.println(depo.poll());
       // System.out.println(depo.element()); exception
        System.out.println(depo.peek());

        Queue<String> wareHouse =new PriorityQueue<>();
        wareHouse.add("milk");
        wareHouse.add("meat");
        wareHouse.add("egg");
        wareHouse.add("orange");
        System.out.println(wareHouse);


    }
}
