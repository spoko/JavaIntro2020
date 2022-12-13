package arraysdemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [][] matrix = {
                {4, 89, -20, 42},//first element is also an array
                {3, 77},
                {75, 444, 45, 34, 56},
                {65, 54, 234, 5643}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Element in position %d%d is %d\n", i, j, matrix[i][j]);
            }
        }
    }
}
