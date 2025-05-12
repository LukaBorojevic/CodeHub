public class PrintAntidiagonal {
    public void printAntidiagonal(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i][array.length - 1 - i] + " ");
        }
    }
}
