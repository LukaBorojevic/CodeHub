public class PrintAboveDiagonal {
    public void printAboveDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < j) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
