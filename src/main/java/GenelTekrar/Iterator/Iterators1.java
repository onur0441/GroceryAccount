package GenelTekrar.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators1 {
    public static void main(String[] args) {

        List<String>myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList);

        Iterator<String> myItr =    myList.iterator();
        while (myItr.hasNext()){

            String el = myItr.next();
            if (el.equals("Clara")){
                myItr.remove();
            }
        }
        System.out.println(myList);

        List<String> yourList =new ArrayList<>();
        yourList.add("Ali");
        yourList.add("Can");
        yourList.add("Aliye");
        System.out.println(yourList);

         ListIterator<String>yourListItr = yourList.listIterator();

         while (yourListItr.hasNext()){

           String el =  yourListItr.next();
           yourListItr.set(el+"*");
         }
        System.out.println(yourList);





    }
}
