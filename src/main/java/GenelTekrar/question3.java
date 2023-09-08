package GenelTekrar;

public class question3 {
    public static void main(String[] args) {
        /*
        String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
         Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
         */
        String [] names ={"Kemal","Jonathan","Mark","Jackson","Ali"};
        for (int i = 0; i <names.length; i++) {
            if (names[i].endsWith("n") || names[i].endsWith("k")){
                System.out.print(names[i].charAt(0));
            }

        }

    }
}
