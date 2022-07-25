import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, total = 0, numberOfI = 0, average;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                total += i;
                numberOfI++;
            }
        }
        average = total / numberOfI;
        System.out.print("Ortalama: " + average);
    }
5
}