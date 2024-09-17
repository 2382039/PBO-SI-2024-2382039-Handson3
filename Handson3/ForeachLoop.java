package Handson3;

public class ForeachLoop {
    public static void main(String[] args) {
        //Array dari angka 1 hingga 20
        int[] angka = new int [20];
        for (int i = 0; i < 20; i++){
            angka[i] = i + 1;
        }

        //For-each loop
        System.out.println("Tampilan angka dari 1 hingga 20, yang melewati angka yang habis dibagi 3\ndan berhenti setelah mencapai angka 15:");
        for (int num : angka){
            if (num > 15) break;
            if (num % 3 !=0){
                System.out.println(num);

            }
        }
    }
}
