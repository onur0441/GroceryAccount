package GenelTekrar.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("Mehmet");
        list.add("Ahmet");
        list.add("Onur");
        list.add("Kübra");
        list.add("Tuba");
        list.add("Mehmet");
        list.add("Duygu");
        System.out.println(list);//[Mehmet, Ahmet, Onur, Kübra, Tuba, Duygu]

        list.add(1,"Zafer");
        System.out.println(list);
        list.addFirst("Onur");
        System.out.println(list);
        list.addLast("Ibrahim");
        System.out.println(list);

        list.remove("Mehmet");
        System.out.println(list);

        list.removeLastOccurrence("Mehmet");
        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list);
        /*
        Retrieves, but does not remove, the head (first element) of this list.
      Returns:
         the head of this list, or null if this list is empty
         */
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.element());
        System.out.println(list);
        list.pop();


    }
}
