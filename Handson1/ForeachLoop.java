package Handson1;

public class ForeachLoop {
    public static void main(String[] args) {
        // Deklarasi array buah
        String[] buah = {"Apel", "Pisang", "Mangga", "Jeruk"};

        // Menggunakan foreach loop
        System.out.println("\nMenggunakan foreach loop:");
        for (String b : buah){
            System.out.println(b);
        }
    }
}
