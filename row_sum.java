package multi_dimen_array;

public class row_sum {

    public static void main(String[] args) {
        int[][] arry;
        arry = new int[3][3];
        int sum = 0;

        // Fill the array with values
        for (int i = 0; i < arry.length; i++) {
            for (int k = 0; k < arry[i].length; k++) {
                arry[i][k] = (3 * i) + k;
            }
        }

        // Calculate and print row sums
        for (int i = 0; i < arry.length; i++) {
            sum = 0;
            for (int k = 0; k < arry[i].length; k++) {
                sum = sum + arry[i][k];
            }
            System.out.println("Sum of the " + i + " row: " + sum); // <-- Moved here
        }
    }
}
