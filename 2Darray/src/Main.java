//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Print2D print2D = new Print2D();
        print2D.print2DArray(array);

        int rows = 4;
        int cols = 4;
        int value = 0;
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value;
                value++;
            }
        }
        print2D.print2DArray(matrix);

        int rowIndex = 2;
        double average = new FindAverage().getRowAwerage(matrix, rowIndex);
        System.out.println("Average for row " + rowIndex + " is " + average);

        PrintDiagonal printDiagonal = new PrintDiagonal();
        printDiagonal.printDiagonal(matrix);

        System.out.println();

        PrintAntidiagonal printAntidiagonal = new PrintAntidiagonal();
        printAntidiagonal.printAntidiagonal(matrix);

        System.out.println();

        PrintAboveDiagonal printAboveDiagonal = new PrintAboveDiagonal();
        printAboveDiagonal.printAboveDiagonal(matrix);


    }
}