package Handson3;

public class ForLoop {
    public static void main(String[] args) {
        //for loop
        System.out.println("Tampilan angka dari 1 hingga 20, yang melewati angka yang habis dibagi 3 \ndan berhenti setelah mencapai angka 15: ");
        for (int i = 1; i <= 15; i++){
            if (i % 3 != 0){
                System.out.println(i);

            }

        }
    }
}
