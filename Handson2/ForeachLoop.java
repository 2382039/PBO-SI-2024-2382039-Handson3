package Handson2;

public class ForeachLoop {
    public static void main(String[] argas) {
        System.out.println("Angka bilangan genap dari 1 hingga 20:");
        int[] numbers = new int[20];

        //Mengisi array dengan bilangan dari 1 hingga 20
        for (int i = 0; i < 20; i++){
            numbers[i] = i + 1;
        }

        //Loop melalui array menggunakan for-each
        for (int number : numbers){
            if (number % 2 == 0){
                System.out.println(number + " ");

            }
        }
        System.out.println();
    }
}
