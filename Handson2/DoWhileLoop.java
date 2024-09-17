package Handson2;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Angka bilangan genap dari 1 hingga 20:");
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }while (i <= 20);
        System.out.println();
    }
}
