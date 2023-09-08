package smallstudygrouplessonsArrays;

import java.util.Arrays;

public class ArraysQuestion3 {
    public static void main(String[] args) {
       // verilen bir int arraydaki en büyük sayiyi yazdıran bir method oluşturun
        int [] arr ={45,78,14,28,4,56,94};
        int maximum =arr[0];
        for (int w :arr ) {
            maximum =Math.max(maximum,w);

        }
        System.out.println(maximum);
         // yada şu şekildede olabilir
        int [] brr ={45,78,14,28,4,56,94};
        Arrays.sort(brr);
        System.out.println(brr[brr.length - 1]);


    }

}
