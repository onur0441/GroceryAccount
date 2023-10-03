package SSG.DimensionalArrays;

public class Questions01 {
    public static void main(String[] args) {
        //verilen bir multi dimensional arrayin tüm elementlerini yazdırınız
        String[][] arr ={{"Onur","Ömer","mustafa","Sedat"},{"Rümeysa","Berfin","Aslı","Eda"}};
        printElement(arr);

    }

    private static void printElement(String[][] arr) {
        for ( String [] w:arr ) {
            for (String each :w ) {
                System.out.println(each+" ");

            }
            System.out.println("\n------------------");

        }

    }
}
