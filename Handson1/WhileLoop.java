package Handson1;

public class WhileLoop {
    public static void main(String[] args) {
        //Deklarasi array buah
        String[] buah = {"Aple", "Pisang", "Mangga", "Jeruk"};

        //Menggunakan while loop
        System.out.println("\nMenggunakan while loop");
        int i = 0;
        while (i < buah.length) {
            System.out.println(buah[i]);
            i++;
        }
    }
}
