import java.util.Scanner;

public class maxsumpath {
    
    public static int maxSum(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int i = 0, j = 0;
        int sumX = 0, sumY = 0, result = 0;
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else { // Found a common element
                result += Math.max(sumX, sumY);
                result += X[i]; // Add the common element
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }
        
        // Add remaining elements of X
        while (i < m) {
            sumX += X[i++];
        }
        
        // Add remaining elements of Y
        while (j < n) {
            sumY += Y[j++];
        }
        
        result += Math.max(sumX, sumY);
        
        return result;
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

        int maxSum = maxSum(X, Y);
        System.out.println("Maximum sum: " + maxSum);

        scanner.close();
    }
}

