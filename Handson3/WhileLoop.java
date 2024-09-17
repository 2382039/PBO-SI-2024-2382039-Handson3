package Handson3;

public class WhileLoop {
    public static void main(String[] args) {
        //While loop
        System.out.println("Tampilan angka dari 1 hingga 20, yang melewati angka yang habis dibagi 3 \ndan berhenti setelah mencapai angka 15:");
        int i = 1;
        while (i <= 15){
            if (i % 3 !=0){
                System.out.println(i);
            }
            i++;
        }
    }
}
