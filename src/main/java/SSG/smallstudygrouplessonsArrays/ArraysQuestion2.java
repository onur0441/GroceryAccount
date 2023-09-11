package SSG.smallstudygrouplessonsArrays;

import java.util.Arrays;

public class ArraysQuestion2 {
    public static void main(String[] args) {
        /*
        bir array oluşturun ve oluşturduğunuz arraydaki sayilari küçükten büyüğe sıralayın
         */

        int [] arr ={45,78,14,28,4,56,94};
        int minimum =arr[0];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
