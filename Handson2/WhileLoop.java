package Handson2;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Angka bilangan genap dari 1 hingga 20:");
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
