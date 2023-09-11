package SSG.SSG.smallstudygrouplessonsArrayList;



import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        /*
        verilen bir listede tekrar eden sayilari sadece 1 tane yapan bir metod oluşturun
        örn : [1,3,5,3,5,6,1,7]
        [1,3,5,6,7] hale dönüştürün
         */
        tekrarsizListYap();





    }
    private  static void tekrarsizListYap (){
        ArrayList<Integer> tekrarliList =new ArrayList<>();
        ArrayList<Integer> tekrarsizList =new ArrayList<>();

        tekrarliList.add(1);
        tekrarliList.add(3);
        tekrarliList.add(5);
        tekrarliList.add(3);
        tekrarliList.add(5);
        tekrarliList.add(6);
        tekrarliList.add(1);
        tekrarliList.add(7);
        for (Integer w : tekrarliList ) {
            if (!tekrarsizList.contains(w)){
                tekrarsizList.add(w);
            }

        }
        System.out.println(tekrarsizList);

    }
}
