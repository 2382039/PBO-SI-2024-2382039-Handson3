package Handson3;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Tampilan angka dari 1 hingga 20, yang melewati angka yang habis dibagi 3 \ndan berhenti setelah mencapai angka 15:");
        int i = 1;
        do {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i++;
        }while (i <= 15);
        }
    }
