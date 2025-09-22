public class FloydsTriangle {
    public static void main(String[] args) {
        int rows = 5; // number of rows for the Floyd's triangle
        int num = 1; // Start from number 1

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // Increment the number for the next print
            }
            System.out.println(); // Move to next line 
        }
    }
}
