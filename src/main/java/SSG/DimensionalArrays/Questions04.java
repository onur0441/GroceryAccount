package SSG.DimensionalArrays;

public class Questions04 {
    public static void main(String[] args) {
         /*
        Soru 5) Asagidaki multi dimensional array'in
        ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
        bir program yaziniz {{1,2,3}, {4,5}, {6}}
        */
        int [][] arr ={{1,2,3},{4,5},{6}};
        int carpim =1;


        for ( int [] w :arr   ) {
            carpim *=w[w.length-1];

        }
        System.out.println(carpim);

    }
}
