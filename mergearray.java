import java.util.Arrays;
import java.util.Scanner;

public class mergearray {
    private static void merge(int[] X, int[] Y, int m, int n) {
        int k = m + n + 1;

        while (m >= 0 && n >= 0) {
            if (X[m] > Y[n]) {
                X[k--] = X[m--];
            } else {
                X[k--] = Y[n--];
            }
        }

        while (n >= 0) {
            X[k--] = Y[n--];
        }

        Arrays.fill(Y, 0);
    }

    public static void rearrange(int[] X, int[] Y) {
        if (X.length == 0) {
            return;
        }

        int k = 0;
        for (int value : X) {
            if (value != 0) {
                X[k++] = value;
            }
        }

        merge(X, Y, k - 1, Y.length - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array X: ");
        int sizeX = scanner.nextInt();
        int[] X = new int[sizeX];

        System.out.println("Enter the elements of array X (separated by space):");
        for (int i = 0; i < sizeX; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of array Y: ");
        int sizeY = scanner.nextInt();
        int[] Y = new int[sizeY];

        System.out.println("Enter the elements of array Y (separated by space):");
        for (int i = 0; i < sizeY; i++) {
            Y[i] = scanner.nextInt();
        }

        rearrange(X, Y);

        System.out.println("Merged array:");
        System.out.println(Arrays.toString(X));

        scanner.close();
    }
}
