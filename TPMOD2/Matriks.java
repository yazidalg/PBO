import java.util.Arrays;
import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Baris matrix ke 1: ");
        int baris1 = scanner.nextInt();
        System.out.print("Kolom matrix ke 1: ");
        int kolom1 = scanner.nextInt();


        System.out.print("Baris matrix ke 2: ");
        int baris2 = scanner.nextInt();
        System.out.print("Kolom matrix ke 2: ");
        int kolom2 = scanner.nextInt();

        // Initialize the matrix arrays
        int[][] matrix1;
        int[][] matrix2;
        int[][] matrix3;
        matrix1 = new int[baris1][kolom1];
        matrix2 = new int[baris2][kolom2];
        matrix3 = new int[2][2];

        matrix1[0][0] = 3;
        matrix1[0][1] = -2;
        matrix1[1][0] = 4;
        matrix1[1][1] = 5;

        matrix2[0][0] = 5;
        matrix2[0][1] = 1;
        matrix2[1][0] = -1;
        matrix2[1][1] = 2;

        matrix3[0][0] = (matrix1[0][0] * matrix2[0][0]) + (matrix1[0][1] * matrix2[1][0]);
        matrix3[0][1] = (matrix1[0][0] * matrix2[0][1]) + (matrix1[0][1] * matrix2[1][1]);
        matrix3[1][0] = (matrix1[1][0] * matrix2[0][0]) + (matrix1[1][1] * matrix2[1][0]);
        matrix3[1][1] = (matrix1[1][0] * matrix2[0][1]) + (matrix1[1][1] * matrix2[1][1]);

        // Function to print array
        System.out.println("Matrix 1");
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }

        System.out.println();
        System.out.println("Matrix 2");
        for (int i = 0; i < matrix2.length; i++) {
            System.out.println(Arrays.toString(matrix2[i]));
        }

        System.out.println();
        System.out.println("Matrix 3");
        for (int i = 0; i < matrix3.length; i++) {
            System.out.println(Arrays.toString(matrix3[i]));
        }

        scanner.close();
    }
}
