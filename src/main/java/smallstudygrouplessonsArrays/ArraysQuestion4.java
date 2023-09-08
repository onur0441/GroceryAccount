package smallstudygrouplessonsArrays;

public class ArraysQuestion4 {
    public static void main(String[] args) {
        /*
        verilen string bir arrayde en uzun ve en kısa stringleri yazdıran bir method oluşturun
         */
        String [] str ={"onur","mehmet","osman"};
        int minimum =str[0].length();
        int maximum =str[0].length();
        for (int i = 0; i <str.length ; i++) {
            minimum =Math.min(minimum,str[i].length());
            maximum =Math.max(maximum,str[i].length());

        }
        for (int i = 0; i <str.length ; i++){
            if (minimum ==str[i].length() ){
                System.out.println(str[i]);
            }
            if (maximum ==str[i].length() ){
                System.out.println(str[i]);
            }

        }


    }
}
