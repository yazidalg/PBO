import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Bilangan bulat: ");
        int angka = scanner.nextInt();
        for (int i = 1; i <= angka; i++) {
            System.out.print(fibbonacci(i));
        }
        scanner.close();
    }

    public static int fibbonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibbonacci(n-1) + fibbonacci(n-2);
        }
    }
}