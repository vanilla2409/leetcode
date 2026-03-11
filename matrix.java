import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:"); 
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        // Fill the matrix with user input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0){
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 2;
                    }
                    for (int k = 0; k < matrix[i].length; k++) {
                        matrix[i][k] = 2;
                    }
                }
            }
            
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==2||matrix[i][j]==0){
                    matrix[i][j]=0;
            }
        }

        // Print the matrix
        for ( i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
}
